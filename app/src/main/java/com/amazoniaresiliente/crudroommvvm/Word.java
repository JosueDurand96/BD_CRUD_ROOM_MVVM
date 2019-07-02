package com.amazoniaresiliente.crudroommvvm;

/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "firstname")
    private String first;

    @Nullable
    @ColumnInfo(name = "lastname")
    private String last;

    @Nullable
    @ColumnInfo(name = "title")
    private String title;

    @Nullable
    @ColumnInfo(name = "department")
    private String department;

    public Word(@NonNull String first, @Nullable String last, @Nullable String title, @Nullable String department) {
        this.first = first;
        this.last = last;
        this.title = title;
        this.department = department;
    }

    public String getFirst(){return this.first;}

    public String getLast(){return this.last;}

    public String getTitle(){return this.title;}

    public String getDepartment(){return this.department;}
}