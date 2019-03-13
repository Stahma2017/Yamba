package com.example.yamba

import android.os.AsyncTask

class PostTask : AsyncTask<String, Void, String>() {
    override fun doInBackground(vararg params: String?): String {
        val yambaCloud: YambaClient =
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
    }
}