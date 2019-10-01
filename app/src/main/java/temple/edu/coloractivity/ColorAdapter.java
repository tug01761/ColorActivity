package temple.edu.coloractivity;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ColorAdapter extends BaseAdapter {

    Context context;
    String[] text;
    String[] colors;

    public ColorAdapter(Context context, String[] text)
    {
        this.context = context;
        this.text = text;
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
