package com.mutsanna.mynotesapp.db

import android.net.Uri
import android.provider.BaseColumns
import com.mutsanna.mynotesapp.db.DatabaseContract.NoteColumns.Companion.TABLE_NAME

object DatabaseContract {

    const val AUTHORITY = "com.mutsanna.mynotesapp"
    const val SCHEME = "content"

    class NoteColumns : BaseColumns {

        companion object {
            const val TABLE_NAME = "note"
            const val _ID = "_id"
            const val TITLE = "title"
            const val DESCRIPTION = "description"
            const val DATE = "date"

            // untuk membuat URI content://com.mutsanna.mynotesapp/note
            val CONTENT_URI: Uri = Uri.Builder().scheme(SCHEME)
                    .authority(AUTHORITY)
                    .appendPath(TABLE_NAME)
                    .build()
        }

    }
}