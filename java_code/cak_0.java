/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * Renamed from cAK
 */
public class cak_0
extends ps_0 {
    private long a;
    private final Collection<eqw_0> b = new ArrayList<eqw_0>();

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        int n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            byte[] byArray2 = new byte[byteBuffer.getInt()];
            eqy_0 eqy_02 = eqy_0.a(byteBuffer.get());
            eqw_0 eqw_02 = (eqw_0)eqy_02.createNew();
            byteBuffer.get(byArray2);
            eqw_02.a(ByteBuffer.wrap(byArray2));
            this.b.add(eqw_02);
        }
        return true;
    }

    public Iterator<eqw_0> b() {
        return this.b.iterator();
    }

    public long c() {
        return this.a;
    }

    @Override
    public int a() {
        return 15427;
    }

    @Override
    public String toString() {
        return "GuildChangeMessage{m_changes=" + this.b.size() + "}";
    }
}

