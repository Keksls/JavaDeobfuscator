/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedList;

public abstract class WV
extends fl_1
implements UF {
    public final WY a = new WW(this, this);
    protected final LinkedList<WX> b = new LinkedList();
    protected long c;
    protected long d;
    protected String e;
    public static final byte[] f = new byte[0];
    private final fo_1[] g = new fo_1[]{this.a};

    @Override
    public String g() {
        return "player=" + this.d();
    }

    public void a(WX wX) {
        this.b.add(wX);
    }

    public boolean b(WX wX) {
        return this.b.remove(wX);
    }

    public void b() {
        this.d = 0L;
        this.e = null;
        this.c = 0L;
    }

    public byte[] c() {
        return this.a(this.b_());
    }

    @Override
    public fo_1[] b_() {
        return this.g;
    }

    public long d() {
        return this.d;
    }

    public void a(long l) {
        this.d = l;
    }

    public String e() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
    }

    public long f() {
        return this.c;
    }

    public void b(long l) {
        this.c = l;
    }

    public String toString() {
        return "CharacterGlobalData{m_clientId=" + this.c + ", m_characterId=" + this.d + ", m_characterName='" + this.e + "'}";
    }
}

