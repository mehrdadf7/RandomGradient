package com.github.mehrdadf7.randomGradient;

import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ColorAdapter extends RecyclerView.Adapter<ColorAdapter.VH> {

    private List<String> list;

    public ColorAdapter(List<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext())
        .inflate(R.layout.layout_color_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list == null ? 0: list.size();
    }

    public class VH extends RecyclerView.ViewHolder {

        private RelativeLayout parent;
        private TextView tv_name;

        public VH(@NonNull View itemView) {
            super(itemView);
            parent = itemView.findViewById(R.id.parent);
            tv_name = itemView.findViewById(R.id.tv);
        }

        public void bind(String name) {

            tv_name.setText(name);

            //First-Way

            ColorRangePicker colorRangePicker = new ColorRangePicker();
            int[] colors = colorRangePicker.getColors();
            GradientDrawable gradientDrawable = new GradientDrawable(
                    GradientDrawable.Orientation.LEFT_RIGHT,
                    new int[] {colors[0], colors[1]}
            );
            gradientDrawable.setCornerRadius(15F);
            parent.setBackground(gradientDrawable);


            //Second-Way
            /*
            Random random = new Random();
            parent.getBackground().setColorFilter(
                    Color.rgb(
                            random.nextInt(255),
                            random.nextInt(255),
                            random.nextInt(255)
                    ),
                    PorterDuff.Mode.DARKEN
            );
            */

        }
    }
}
