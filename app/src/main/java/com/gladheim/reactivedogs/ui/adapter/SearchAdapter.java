package com.gladheim.reactivedogs.ui.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.android.volley.toolbox.Volley;
import com.gladheim.petsapi.model.Pets;
import com.gladheim.reactivedogs.R;
import com.gladheim.reactivedogs.utils.volley.BitmapLruCache;

/**
 * Created by David on 30/12/15.
 */
public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {

    private Context context;
    private Pets pets = new Pets();
    private OnItemClickListener onItemClickListener;

    public SearchAdapter(Context context){
        this.context = context;
    }

    public void addPets(Pets pets){
        this.pets = pets;
    }

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_pet, parent, false);

        SearchViewHolder viewHolder = new SearchViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {

        ImageLoader.ImageCache imageCache = new BitmapLruCache();
        ImageLoader imageLoader = new ImageLoader(Volley.newRequestQueue(context), imageCache);
        holder.thumbnail.setImageUrl(pets.get(position).getImage().getUrl(), imageLoader);
        holder.thumbnail.setDefaultImageResId(R.drawable.placeholder);
        holder.thumbnail.setErrorImageResId(R.drawable.placeholder);

        holder.title.setText(pets.get(position).getPetType());
        holder.race.setText(pets.get(position).getRace());
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public void setOnItemClickListener(OnItemClickListener listener) {
        onItemClickListener = listener;
    }

    public class SearchViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public NetworkImageView thumbnail;
        public TextView title;
        public TextView race;

        public SearchViewHolder(View itemView) {

            super(itemView);
            itemView.setOnClickListener(this);
            thumbnail = (NetworkImageView) itemView.findViewById(R.id.thumbnail);
            title = (TextView) itemView.findViewById(R.id.title);
            race = (TextView) itemView.findViewById(R.id.race);

        }

        @Override
        public void onClick(View v) {
            onItemClickListener.onItemClick(v, getAdapterPosition());
        }
    }

    public interface OnItemClickListener {
        void onItemClick(View v, int position);
    }

}
