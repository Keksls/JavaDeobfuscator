/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bYd
 */
public class byd_0
extends alk_2 {
    protected static final Logger a = Logger.getLogger(byd_0.class);
    private final Integer b;
    private final Integer c;
    private final int d;
    private final bYe e;

    public byd_0() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = bYe.a;
    }

    public byd_0(bYe bYe2, int n, int n2, int n3) {
        this.e = bYe2;
        this.b = n;
        this.c = n2;
        this.d = n3;
    }

    @Override
    public short a() {
        return 4;
    }

    @Override
    public akq_1 b() {
        akq_1 akq_12 = new akq_1("event");
        akq_12.a("action", this.e.a());
        akq_12.a("referenceId", this.b);
        akq_12.a("quantity", this.c);
        akq_12.a("price", this.d);
        return akq_12;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object object) {
        return object instanceof byd_0;
    }
}

