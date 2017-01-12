package tutorial.sonu.com.gridviewexample;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Sonu on 1/3/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mThumbIds.length;
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
        ImageView imageView;

        if (convertView == null)
        {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85,85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else
        {
            imageView = (ImageView)convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    public Integer[] mThumbIds = {
            R.drawable.received_m_mid_1388686873660_f0b0096236bcff6744_0,
            R.drawable.received_m_mid_1389028993426_ca3c2064e48bd71553_0,
            R.drawable.received_m_mid_1389113692018_e6a7d7ce1b2cef0497_0,
            R.drawable.received_m_mid_1398082307175_7e431d0ee8d954a994_0,
            R.drawable.received_m_mid_1398082916068_71cfd3cbc7adfe2e02_0,
            R.drawable.received_m_mid_1398082985145_e505dc1c90fe71b491_0,
            R.drawable.received_m_mid_1398093490874_381ad434a900138139_0,
            R.drawable.received_m_mid_1398093599905_cc77ba260fe91c4b72_0,
            R.drawable.received_m_mid_1398148378342_a6cbf935111bbc3089_0,
            R.drawable.received_m_mid_1388686873660_f0b0096236bcff6744_0,
            R.drawable.received_m_mid_1389028993426_ca3c2064e48bd71553_0,
            R.drawable.received_m_mid_1389113692018_e6a7d7ce1b2cef0497_0,
            R.drawable.received_m_mid_1398082307175_7e431d0ee8d954a994_0,
            R.drawable.received_m_mid_1398082916068_71cfd3cbc7adfe2e02_0,
            R.drawable.received_m_mid_1398082985145_e505dc1c90fe71b491_0,
            R.drawable.received_m_mid_1398093490874_381ad434a900138139_0,
            R.drawable.received_m_mid_1398093599905_cc77ba260fe91c4b72_0,
            R.drawable.received_m_mid_1398148378342_a6cbf935111bbc3089_0,
    };
}
