/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eLI
 */
public class eli_0
implements Comparable {
    private Long b;
    private Short c;
    protected static final Logger a = Logger.getLogger(eli_0.class);

    public eli_0(Long l, Short s2) {
        this.b = l;
        this.c = s2;
    }

    public Long a() {
        return this.b;
    }

    public void a(Long l) {
        this.b = l;
    }

    public Short b() {
        return this.c;
    }

    public void a(Short s2) {
        this.c = s2;
    }

    public int compareTo(@NotNull Object object) {
        if (!(object instanceof eli_0)) {
            throw new ClassCastException();
        }
        eli_0 eli_02 = (eli_0)object;
        int n = this.c.compareTo(eli_02.b());
        return n;
    }

    public boolean equals(Object object) {
        if (!(object instanceof eli_0)) {
            return false;
        }
        eli_0 eli_02 = (eli_0)object;
        return this.a().equals(eli_02.a());
    }
}

