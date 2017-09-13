package Adapter;

import android.support.v7.widget.AppCompatTextView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jinsei.cd.R;

import java.util.List;

import model.User;

/**
 * Created by JinSei on 6/5/2017.
 */

public class UsersrecyclerAdapter extends RecyclerView.Adapter<UsersrecyclerAdapter.UserViewHolder> {
private List<User> listUsers;
    public UsersrecyclerAdapter(List<User> listUsers) {
        this.listUsers = listUsers;
    }
    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // inflating recycler item view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_user_recycler, parent, false);

        return new UserViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(UserViewHolder holder, int position) {
        holder.textViewItem.setText(listUsers.get(position).getItem());
        holder.textViewAmount.setText(listUsers.get(position).getAmount());

        }

    @Override
    public int getItemCount() {
        Log.v(UsersrecyclerAdapter.class.getSimpleName(),""+listUsers.size());
        return listUsers.size();
    }
    /**
     * ViewHolder class
     */
    public class UserViewHolder extends RecyclerView.ViewHolder {

        public AppCompatTextView textViewItem;
        public AppCompatTextView textViewAmount;


        public UserViewHolder(View view) {
            super(view);
            textViewItem = (AppCompatTextView) view.findViewById(R.id.textViewName);
            textViewAmount = (AppCompatTextView) view.findViewById(R.id.textViewEmail);

        }
    }




}

