package br.edu.ifsp.scl.projetorecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.HolderItemHero> {

    private ArrayList<Hero> heroList;

    public HeroAdapter(ArrayList<Hero> heroList) {
        this.heroList = heroList;
    }

    @NonNull
    @Override
    public HolderItemHero onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemList = inflater.inflate(R.layout.list_layout, parent, false);
        return new HolderItemHero(itemList);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderItemHero holder, int position) {
        Hero hero = heroList.get(position);

        holder.image.setImageResource(hero.getImage());
        holder.title.setText(hero.getTitle());
        holder.desc.setText(hero.getDesc());
    }

    @Override
    public int getItemCount() {
        return heroList.size();
    }

    public class HolderItemHero extends RecyclerView.ViewHolder {

        private ImageView image;
        private TextView title;
        private TextView desc;


        public HolderItemHero(@NonNull View itemView) {
            super(itemView);

            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            desc = itemView.findViewById(R.id.desc);
        }
    }
}


