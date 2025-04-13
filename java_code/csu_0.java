/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from csu
 */
public class csu_0
extends ps_0 {
    private ft_1 a;
    private List<Integer> b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = ft_1.b(byteBuffer.getInt());
        this.b = new ArrayList<Integer>();
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.b.add(byteBuffer.getInt());
        }
        return false;
    }

    public List<Integer> b() {
        return this.b;
    }

    public ft_1 c() {
        return this.a;
    }

    @Override
    public int a() {
        return 12719;
    }
}

