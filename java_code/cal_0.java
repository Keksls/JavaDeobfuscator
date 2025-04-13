/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cAL
 */
public class cal_0
extends ps_0 {
    private int a;
    private boolean b;

    @Override
    public boolean a(byte ... byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getInt();
        this.b = byteBuffer.get() > 0;
        return true;
    }

    public erb_1 b() {
        return erb_1.values()[this.a];
    }

    public boolean c() {
        return this.b;
    }

    @Override
    public int a() {
        return 15286;
    }

    @Override
    public String toString() {
        return "GuildErrorMessage{m_errorId=" + this.a + "}";
    }
}

