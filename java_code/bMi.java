/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import org.apache.log4j.Logger;

public class bMi
extends bMd<exk_2>
implements ffb_0 {
    private static final Logger J = Logger.getLogger(bMi.class);

    public bMi(exk_2 exk_22) {
        this.I = exk_22;
        this.H = exk_22.f();
        this.H.a(this);
        this.a();
    }

    @Override
    protected boolean c() {
        return azu_0.j().k().cG().a(((exk_2)this.I).a()) != null || azu_0.j().k().da().a((ts_0)((Object)this.I)) != null;
    }

    @Override
    public Object b(String string) {
        if (string.equals("smallIconUrl")) {
            return ((exk_2)this.I).b("iconUrl");
        }
        if (string.equals("breedName")) {
            return ((exk_2)this.I).b("name");
        }
        if (string.equals("bonusDescription")) {
            boolean bl = !this.H.o() && this.H.f() > 0;
            ArrayList<String> arrayList = new ArrayList<String>();
            Object object = ((exk_2)this.I).b("effectAndCaracteristic");
            if (object == null) {
                return arrayList;
            }
            for (String string2 : (ArrayList)object) {
                ani_2 ani_22 = new ani_2();
                if (!bl) {
                    ani_22.i();
                    ani_22.a(azf_2.o.w());
                }
                ani_22.a((CharSequence)string2);
                if (!bl) {
                    ani_22.j();
                }
                arrayList.add(ani_22.r());
            }
            return arrayList;
        }
        return super.b(string);
    }

    @Override
    public boolean a(bmr_1 bmr_12) {
        eyz_0 eyz_02 = bmr_12.cG();
        if (eyz_02 == null) {
            return false;
        }
        Long l = eyz_02.a(exh_2.y);
        if (l == null) {
            return false;
        }
        return l.longValue() == ((exk_2)this.I).a();
    }

    @Override
    public void a(String string) {
        fis_1.a().a((ajf_1)this, "name");
    }

    @Override
    public void a(int n) {
        fis_1.a().a((ajf_1)this, "animatedElement", "color");
    }

    @Override
    public void b(int n) {
        fis_1.a().a((ajf_1)this, "petAnimationEquipment", "animatedElement", "equipment");
    }

    @Override
    public void c(int n) {
        fis_1.a().a((ajf_1)this, "hp", "hpDescription");
    }

    @Override
    public void d(int n) {
        ((exk_2)this.I).P();
        fis_1.a().a((ajf_1)this, "levelTextShort", "xpValue", "xpText", "bonusDescription");
    }

    @Override
    public void a(wu_0 wu_02) {
        fis_1.a().a((ajf_1)this, "lastMealDateText", "dietDescription");
    }

    @Override
    public void b(wu_0 wu_02) {
        if (this.H.f() == 0) {
            return;
        }
        this.G.e("AnimEmote-Effrayee");
        this.G.E();
    }

    @Override
    public void c(wu_0 wu_02) {
        fis_1.a().a((ajf_1)this, "isActive");
        fis_1.a().a(this.I, "backgroundStyle");
    }

    @Override
    public void e(int n) {
    }

    public exk_2 j() {
        return (exk_2)this.I;
    }

    @Override
    public String e() {
        String string = this.H.b();
        return string == null || string.length() == 0 ? ((exk_2)this.I).N() : string;
    }

    @Override
    public void i() {
        super.i();
        this.H.b(this);
    }

    public void k() {
        fis_1.a().a((ajf_1)this, F);
    }

    public biE l() {
        return this.G;
    }

    @Override
    public long h() {
        return ((exk_2)this.I).a();
    }

    @Override
    public int g() {
        return ((exk_2)this.I).aT_();
    }
}

