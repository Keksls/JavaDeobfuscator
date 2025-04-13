/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bYM
 */
public class bym_0
extends alk_2 {
    protected static final Logger a = Logger.getLogger(bym_0.class);
    private final Integer b;

    public bym_0(int n) {
        this.b = n;
    }

    @Override
    public short a() {
        return 2;
    }

    @Override
    public akq_1 b() {
        return null;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof bym_0 && ((bym_0)object).b.equals(this.b);
    }
}

