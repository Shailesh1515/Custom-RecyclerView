package com.food.customrecyclerview;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomRecyclerAdapter extends RecyclerView.Adapter<CustomRecyclerAdapter.ViewHolder> {

    private Context context;
    private List<PersonUtils> personUtils;

    public CustomRecyclerAdapter(Context context, List personUtils) {
        this.context = context;
        this.personUtils = personUtils;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.itemView.setTag(personUtils.get(position));

        PersonUtils pu = personUtils.get(position);

        holder.userImg.setImageResource(Integer.parseInt(pu.getUserImg()));
        holder.pName.setText(pu.getPersonName());
        holder.pid.setText(pu.getId());
        holder.pJobProfile.setText(pu.getJobProfile());

    }

    @Override
    public int getItemCount() {
        return personUtils.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        public TextView pName;
        public TextView pid;
        public ImageView userImg;
        public TextView pJobProfile;

        public ViewHolder(View itemView) {
            super(itemView);

            userImg = (ImageView) itemView.findViewById(R.id.userImg);
            pid = (TextView) itemView.findViewById(R.id.pid);
            pName = (TextView) itemView.findViewById(R.id.pNametxt);
            pJobProfile = (TextView) itemView.findViewById(R.id.pJobProfiletxt);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    PersonUtils cpu = (PersonUtils) view.getTag();

                    Toast.makeText(view.getContext(), cpu.getPersonName()+" is "+ cpu.getJobProfile()+" is "+ cpu.getId()+" is "+ cpu.getUserImg(), Toast.LENGTH_SHORT).show();

                }
            });

        }
    }
}
