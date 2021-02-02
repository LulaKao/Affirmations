package com.quarterlife.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.quarterlife.affirmations.databinding.ListItemBinding
import com.quarterlife.affirmations.model.Affirmation

/**
 * Adapter for the [RecyclerView] in MainActivity. Displays [Affirmation] data object.
 */
class ItemAdapter(
    private val context : Context,
    private val dataset : List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    private lateinit var binding: ListItemBinding // add this for view binding

    /**
     * Provide a reference to the views for each data item.
     * Complex data items may need more than one view per item,
     * and you provide access to all the views for a data item in a view holder.
     * Each data item is just an Affirmation object.
     */
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view){
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false) // add this for view binding
        return ItemViewHolder(binding.root) // add this for view binding
    }

    override fun getItemCount() = dataset.size

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        binding.itemTitle.text = context.resources.getString(dataset[position].stringResourceId) // set item title
    }
}