/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.net.MalformedURLException;
import java.net.URL;
import org.apache.log4j.Logger;

/*
 * Renamed from bVA
 */
public abstract class bva_0
implements ajh_1 {
    private static final Logger b = Logger.getLogger(bva_0.class);
    protected final asp_1 a;
    private fso d;
    fso e;

    public bva_0(asp_1 asp_12) {
        this.a = asp_12;
    }

    public asp_1 a() {
        return this.a;
    }

    public abstract void b();

    public void a(long l) {
        boolean bl;
        asr_1 asr_12 = this.a.e();
        boolean bl2 = bl = asr_12.equals(asr_1.a) || l >= (long)asr_12.a() && (l < (long)asr_12.b() || asr_12.b() == -1);
        if (this.d.isVisible() != bl) {
            this.d.setVisible(bl);
        }
    }

    public fso a(fso fso2, bVw bVw2) {
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        afk_2 afk_22 = this.a.a();
        this.d = fso.checkOut();
        fid_1 fid_12 = new fid_1();
        fid_12.onCheckOut();
        fid_12.setSize(new fjf_2(afk_22.e(), afk_22.f()));
        fid_12.setX(afk_22.a());
        double d2 = ((fid_1)fso2.getLayoutData()).getSize().getHeight();
        fid_12.setY((int)(d2 - (double)afk_22.d()));
        this.d.setLayoutData(fid_12);
        fic_1 fic_12 = new fic_1();
        fic_12.onCheckOut();
        fic_12.setAdaptToContentSize(true);
        this.d.setLayoutManager(fic_12);
        asq_1 asq_12 = this.a.c();
        this.e = null;
        if (asq_12 != null) {
            this.e = fso.checkOut();
            object5 = new fid_1();
            ((fid_1)object5).onCheckOut();
            ((fid_1)object5).setSize(new fjf_2(100.0f, 100.0f));
            ((fid_1)object5).setAlign(frk_0.i);
            this.e.setLayoutData((fif_1)object5);
            if (asq_12.c()) {
                try {
                    object4 = asq_12.d().a().toURL();
                    object3 = new ayo_2(fdo_2.b().a((URL)object4));
                    object2 = new fqv();
                    ((fqv)object2).onCheckOut();
                    ((fqv)object2).setPixmap((ayo_2)object3);
                    object = new fsk_0();
                    ((fsk_0)object).onCheckOut();
                    ((fvE)object).setNonBlocking(true);
                    ((fvE)object).setExpandable(false);
                    ((fsk_0)object).add((fyb_0)object2);
                    ((fvE)object).onChildrenAdded();
                    ((fsk_0)object).a();
                    ((fvE)object).setSizeToPrefSize();
                    this.e.add((fyb_0)object);
                    this.e.onChildrenAdded();
                }
                catch (MalformedURLException malformedURLException) {
                    b.warn((Object)("URL malform\u00e9e : \"" + asq_12.d().a() + "\""));
                }
            } else {
                object4 = new fbf_1();
                ((fbf_1)object4).onCheckOut();
                ((fbf_1)object4).setColor(asq_12.b());
                this.e.getAppearance().add((fyb_0)object4);
            }
            this.d.add(this.e);
            this.d.onChildrenAdded();
        }
        if ((object5 = this.a.d()) != null) {
            object4 = fso.checkOut();
            object3 = new fid_1();
            ((fid_1)object3).onCheckOut();
            ((fid_1)object3).setSize(new fjf_2(100.0f, 100.0f));
            ((fid_1)object3).setAlign(frk_0.i);
            ((fvE)object4).setLayoutData((fif_1)object3);
            ((fvE)object4).setVisible(false);
            if (((asq_1)object5).c()) {
                try {
                    object2 = ((asq_1)object5).d().a().toURL();
                    object = new ayo_2(fdo_2.b().a((URL)object2));
                    fqv fqv2 = new fqv();
                    fqv2.onCheckOut();
                    fqv2.setPixmap((ayo_2)object);
                    fsk_0 fsk_02 = new fsk_0();
                    fsk_02.onCheckOut();
                    fsk_02.setNonBlocking(true);
                    fsk_02.setExpandable(false);
                    fsk_02.add(fqv2);
                    fsk_02.onChildrenAdded();
                    fsk_02.a();
                    fsk_02.setSizeToPrefSize();
                    ((fvE)object4).add(fsk_02);
                    ((fvE)object4).onChildrenAdded();
                }
                catch (MalformedURLException malformedURLException) {
                    b.warn((Object)("URL malform\u00e9e : \"" + ((asq_1)object5).d().a() + "\""));
                }
            } else {
                object2 = new fbf_1();
                ((fbf_1)object2).onCheckOut();
                ((fbf_1)object2).setColor(((asq_1)object5).b());
                ((fso)object4).getAppearance().add((fyb_0)object2);
            }
            this.d.add((fyb_0)object4);
            this.d.onChildrenAdded();
            this.d.addEventListener(frd_0.y, new bvb_0(this, (fso)object4), false);
            this.d.addEventListener(frd_0.z, new bvc_0(this, (fso)object4), false);
        }
        if ((object4 = this.a.e()) != null && ((asr_1)object4).a() > 0) {
            this.d.setVisible(false);
        }
        return this.d;
    }

    public void c() {
        if (this.d != null) {
            this.d.destroySelfFromParent();
        }
    }
}

