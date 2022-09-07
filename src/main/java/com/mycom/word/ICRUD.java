package com.mycom.word;

/*
* add
* update
* delete
* select
* */

// shows error when not declared as interface (but as class)
public interface ICRUD {
    public Object add();  // add data
    public int update(Object obj); // update data
    public int delete(Object obj); // delete data
    public void selectOne(int id); // select 1 data (to view)
}

// Some Q's (why the return types are Obj, int respectively)
