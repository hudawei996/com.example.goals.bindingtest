package com.example.goals.bindingtest;

import android.view.View;
import android.widget.Toast;

/**
 * Date: 2018/5/29.
 * Description:
 *
 * @author huyongqiang
 */

public class User {
    public String firstName;
    public String lastName;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * 重点：添加点击事件
     *
     * @param view
     */
    public void onClickName(View view) {
        Toast.makeText(view.getContext(), "点击了名字", Toast.LENGTH_SHORT).show();
    }
}
