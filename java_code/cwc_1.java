/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntByteHashMap
 */
import gnu.trove.map.hash.TIntByteHashMap;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/*
 * Renamed from cwC
 */
public class cwc_1
extends ps_0 {
    private ArrayList<cwd_1> a;

    @Override
    public boolean a(byte ... byArray) {
        this.a = new ArrayList();
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            int n2 = byteBuffer.getInt();
            int n3 = byteBuffer.getInt();
            float f2 = byteBuffer.getFloat();
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            byteBuffer.get(byArray2);
            String string = Cz.a(byArray2);
            int n4 = byteBuffer.getInt();
            TIntByteHashMap tIntByteHashMap = new TIntByteHashMap();
            int n5 = byteBuffer.getInt();
            for (int i2 = 0; i2 < n5; ++i2) {
                tIntByteHashMap.put(byteBuffer.getInt(), byteBuffer.get());
            }
            this.a.add(new cwd_1(n2, n3, f2, string, n4, tIntByteHashMap));
        }
        return true;
    }

    @Override
    public int a() {
        return 14049;
    }

    public ArrayList<cwd_1> b() {
        return this.a;
    }
}

