/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import org.apache.log4j.Logger;

/*
 * Renamed from bed
 */
public final class bed_2
implements agw_0 {
    static final Logger a = Logger.getLogger(bed_2.class);
    private static final bed_2 b = new bed_2();

    public static bed_2 a() {
        return b;
    }

    private bed_2() {
    }

    public void a(YK yK) {
        bow_0 bow_02 = new bow_0();
        fim_0.a(bow_02);
        asw_2.a().a(new aRv(), new bee_1(this, bow_02));
        yK.b(this);
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.effectGroups", new Object[0]);
    }
}

