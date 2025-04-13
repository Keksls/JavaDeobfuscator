/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.List;

public class Fl {
    private final ga_0 a;

    public Fl(ga_0 ga_02) {
        this.a = ga_02;
    }

    public void a(gh_0 gh_02) {
        try {
            List<gc_0> list = this.a.b();
            gh_02.a((short)list.size());
            for (gc_0 gc_02 : list) {
                gh_02.a((byte)gc_02.o().a());
                Fm fm = Fn.a(gc_02);
                if (fm == null) continue;
                fm.a(gh_02);
            }
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Unable to save sprite definitions", iOException);
        }
    }
}

