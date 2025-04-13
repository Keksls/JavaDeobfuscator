/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

public class fkM
extends fkN {
    private static final Logger b = Logger.getLogger(fkM.class);
    private final fkN c;

    public fkM(fkt_0 fkt_02, fkN fkN2) {
        super(fkt_02);
        this.c = fkN2;
    }

    public fkN b() {
        return this.c;
    }

    @Override
    public boolean a(fkN fkN2) {
        if (this == fkN2) {
            return true;
        }
        if (fkN2 == null || this.getClass() != fkN2.getClass()) {
            return false;
        }
        fkM fkM2 = (fkM)fkN2;
        return this.a.equals(fkM2.a);
    }

    public String toString() {
        return "BuildingDependency{m_item=" + this.a + ", m_constructionError=" + this.c + "}";
    }

    @Override
    public final fkO a() {
        return fkO.e;
    }
}

