/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from cAT
 */
public class cat_0
extends ps_0 {
    private List<esm_2> a = new ArrayList<esm_2>();
    private int b;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b = byteBuffer.getInt();
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.a.add(esm_2.a(byteBuffer));
        }
        return true;
    }

    public List<esm_2> b() {
        return Collections.unmodifiableList(this.a);
    }

    public int c() {
        return this.b;
    }

    @Override
    public int a() {
        return 1173;
    }
}

