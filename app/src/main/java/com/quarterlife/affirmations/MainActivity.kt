package com.quarterlife.affirmations

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quarterlife.affirmations.adapter.ItemAdapter
import com.quarterlife.affirmations.data.DataSource
import com.quarterlife.affirmations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binging: ActivityMainBinding // add this for view binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binging = ActivityMainBinding.inflate(layoutInflater) // add this for view binding
        setContentView(binging.root) // add this for view binding

        // initialize data
        val dataList = DataSource().loadAffirmations()

        // initialize recyclerView
        val recyclerView = binging.recyclerView

        // set adapter
        recyclerView.adapter = ItemAdapter(this, dataList)

        /*  Use this setting to improve performance if we know that
            changes in content do not change the layout size of the RecyclerView.  */
        recyclerView.setHasFixedSize(true)

        /**     設定 recyclerView 的緩存數量，若不設定的話，內容就會每七個重複一輪。
         *      資料是抓到正確的，不會重複，但是顯示出來的內容會重複。
         *      20 是想要緩存的 item 數量，可以根據自己的需要進行調整。 */
        recyclerView.setItemViewCacheSize(20)
    }
}
