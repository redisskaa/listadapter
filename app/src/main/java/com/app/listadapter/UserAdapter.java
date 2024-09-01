package com.app.listadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class UserAdapter extends BaseAdapter {
    private List<UserModel> userList;
    private LayoutInflater inflater;

    public UserAdapter(Context context, List<UserModel> userList) {
        this.userList = userList;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return userList.size();
    }

    @Override
    public Object getItem(int position) {
        return userList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.list_row, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.avatar);
        TextView textName = convertView.findViewById(R.id.nameText);
        TextView textCountry = convertView.findViewById(R.id.countryText);
        TextView textCity = convertView.findViewById(R.id.cityText);
        TextView textAge = convertView.findViewById(R.id.ageText);

        UserModel user = userList.get(position);
        imageView.setImageResource(user.getImage());
        textName.setText(user.getName());
        textCountry.setText(user.getCountry());
        textCity.setText(user.getCity());
        textAge.setText(user.getAge());

        return convertView;
    }
}
