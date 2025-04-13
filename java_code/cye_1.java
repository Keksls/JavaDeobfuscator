/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Renamed from cyE
 */
public class cye_1
extends ps_0 {
    private long a;
    private int b;
    private short c;
    private final ArrayList<Integer> d = new ArrayList();
    private final ArrayList<Integer> e = new ArrayList();

    @Override
    public boolean a(byte[] byArray) {
        int n;
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        this.c = byteBuffer.getShort();
        int n2 = byteBuffer.getInt();
        for (n = 0; n < n2; ++n) {
            this.d.add(byteBuffer.getInt());
        }
        n = byteBuffer.getInt();
        for (int k = 0; k < n; ++k) {
            this.e.add(byteBuffer.getInt());
        }
        return true;
    }

    @Override
    public int a() {
        return 12093;
    }

    public int b() {
        return this.b;
    }

    public long c() {
        return this.a;
    }

    public short d() {
        return this.c;
    }

    public ArrayList<Integer> e() {
        return new ArrayList<Integer>(Collections.unmodifiableList(this.d));
    }

    public ArrayList<Integer> f() {
        return new ArrayList<Integer>(Collections.unmodifiableList(this.e));
    }

    @Override
    public String toString() {
        return "SpellDeckSynchronizeMessage{m_playerId=" + this.a + ", m_deckIndex=" + this.b + ", m_level=" + this.c + ", m_activeSpells=" + this.d + ", m_passiveSpells=" + this.e + "}";
    }
}

