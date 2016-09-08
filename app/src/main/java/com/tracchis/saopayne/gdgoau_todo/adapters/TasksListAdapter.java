package com.tracchis.saopayne.gdgoau_todo.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.tracchis.saopayne.gdgoau_todo.R;
import com.tracchis.saopayne.gdgoau_todo.models.Task;
import com.tracchis.saopayne.gdgoau_todo.viewholders.TasksListRVHolder;

import java.util.List;

/**
 * Created by saopayne on 9/8/16.
 */
public class TasksListAdapter extends RecyclerView.Adapter <TasksListRVHolder> {

    private List<Task> task;
    protected Context context;

    public TasksListAdapter(Context context, List<Task> task) {
        this.task = task;
        this.context = context;
    }
    @Override
    public TasksListRVHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TasksListRVHolder viewHolder = null;
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.task_item_layout, parent, false);
        viewHolder = new TasksListRVHolder(layoutView, task);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TasksListRVHolder holder, int position) {
        holder.categoryTitle.setText(task.get(position).getTask());
    }
    @Override
    public int getItemCount() {
        return this.task.size();
    }



}
