/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from bki
 */
public class bki_1
extends we_0 {
    private final wu_0 c;
    private final boolean d;

    public bki_1(wu_0 wu_02) {
        this(wu_02, wu_02, true);
    }

    public bki_1(wu_0 wu_02, wu_0 wu_03) {
        this(wu_02, wu_03, false);
    }

    private bki_1(wu_0 wu_02, wu_0 wu_03, boolean bl) {
        super(wu_02);
        this.c = wu_03;
        this.d = bl;
    }

    public void b(wq_0 wq_02) {
        String string = bae.h().f().h();
        btx_1.a().a(string, this.c);
        if (this.d) {
            btx_1.a().a(string, this.c.u());
        }
        bki_1 bki_12 = this.b();
        wq_02.b(bki_12);
    }

    public bki_1 b() {
        wu_0 wu_02 = this.c.r();
        if (this.d) {
            wu_02 = wu_02.u();
        }
        return new bki_1(this.b.u(), wu_02);
    }

    @Override
    public void a(wq_0 wq_02) {
        this.b(wq_02);
        wq_02.a(this);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof bki_1)) {
            return false;
        }
        bki_1 bki_12 = (bki_1)object;
        return Objects.equals(this.c, bki_12.c) && Objects.equals(this.b, bki_12.b) && Objects.equals(this.d, bki_12.d);
    }

    public int hashCode() {
        return Objects.hash(this.c, this.b, this.d);
    }

    public String toString() {
        return "DailyAlmanachEventRetriever{m_dateToRetrieve=" + this.c + ", m_date=" + this.b + ", m_retrieveTwoDay=" + this.d + "}";
    }

    public wu_0 c() {
        return this.c;
    }

    public boolean d() {
        return this.d;
    }
}

