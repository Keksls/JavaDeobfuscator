/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from beo
 */
public class beo_1
implements agw_0 {
    private static final Logger a = Logger.getLogger(beo_1.class);

    public void a(YK yK) {
        asw_2.a().a(new aro_0(), aro_02 -> {
            brn_2 brn_22 = new brn_2(aro_02.c(), aro_02.d(), aro_02.e(), beo_1.a(aro_02));
            brp_2.a().a(brn_22);
        });
        yK.b(this);
    }

    private static List<brm_2> a(aro_0 aro_02) {
        ArrayList<brm_2> arrayList = new ArrayList<brm_2>();
        if (aro_02.g() == null) {
            return arrayList;
        }
        for (arp_0 arp_02 : aro_02.g()) {
            brm_2 brm_22 = new brm_2(arp_02.a(), arp_02.b(), aro_02.c(), arp_02.e(), beo_1.a(arp_02.d()), beo_1.a(arp_02.c()), beo_1.a(arp_02));
            arrayList.add(brm_22);
            brp_2.a().a(brm_22);
        }
        return arrayList;
    }

    @NotNull
    private static List<bro_2> a(arp_0 arp_02) {
        ArrayList<bro_2> arrayList = new ArrayList<bro_2>();
        if (arp_02.f() == null) {
            a.warn((Object)("[Guide] Guide id=" + arp_02.a() + " has no element to display"));
            return arrayList;
        }
        for (arq_0 arq_02 : arp_02.f()) {
            arrayList.add(new bro_2(arq_02.a(), arq_02.b(), arq_02.c()));
        }
        return arrayList;
    }

    @Nullable
    private static apc_2 a(String string) {
        try {
            return eyS.c(string);
        }
        catch (Exception exception) {
            a.error((Object)("Error when compiling criterion for Guide : " + string), (Throwable)exception);
            return null;
        }
    }

    @Override
    public String m_() {
        return bae.h().a("contentLoader.guideCategory", new Object[0]);
    }
}

