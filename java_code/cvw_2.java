/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.list.array.TByteArrayList
 *  gnu.trove.list.array.TIntArrayList
 */
import gnu.trove.list.array.TByteArrayList;
import gnu.trove.list.array.TIntArrayList;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from cvW
 */
public class cvw_2
extends ps_0 {
    private final ArrayList<wh_2> a = new ArrayList();
    private final TByteArrayList b = new TByteArrayList();
    private final TIntArrayList c = new TIntArrayList();

    public List<wh_2> b() {
        return this.a;
    }

    public TByteArrayList c() {
        return this.b;
    }

    public TIntArrayList d() {
        return this.c;
    }

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        int n = byteBuffer.get() & 0xFF;
        for (int k = 0; k < n; ++k) {
            wh_2 wh_22 = new wh_2();
            if (!wh_22.b(byteBuffer)) {
                A.error((Object)"Erreur durant la d\u00e9-serialisation d'un des inventaires marchands");
                return false;
            }
            this.a.add(wh_22);
            this.b.add(byteBuffer.get());
            this.c.add(byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int a() {
        return 12018;
    }
}

