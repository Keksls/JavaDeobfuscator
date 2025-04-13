/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Objects
 */
import com.google.common.base.Objects;
import java.io.Serializable;

public class Cm<F, S>
implements Serializable {
    private static final long a = -8480619990108172965L;
    private final F b;
    private final S c;

    public Cm(F f2, S s2) {
        this.b = f2;
        this.c = s2;
    }

    public F a() {
        return this.b;
    }

    public S b() {
        return this.c;
    }

    public static <F, S> Cm<F, S> a(F f2, S s2) {
        return new Cm<F, S>(f2, s2);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        Cm cm = (Cm)object;
        return Objects.equal(this.b, cm.b) && Objects.equal(this.c, cm.c);
    }

    public int hashCode() {
        return Objects.hashCode((Object[])new Object[]{this.b, this.c});
    }

    public String toString() {
        return "ObjectPair{m_first=" + this.b + ", m_second=" + this.c + "}";
    }
}

