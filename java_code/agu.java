/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity3D;
import com.ankamagames.framework.graphics.engine.material.Material;
import org.apache.log4j.Logger;

public class agu {
    final agx c;
    static final Logger d = Logger.getLogger(agu.class);
    public static final String a = "png";
    final Entity3D e = (Entity3D)Entity3D.c.d();
    atd_2 f;
    protected String b;
    boolean g;
    private final azu_2 h;

    public agu(azu_2 azu_22, agx agx2) {
        this.c = agx2;
        this.h = azu_22;
    }

    public final void a(atd_2 atd_22, String string, String ... stringArray) {
        if (this.f != null) {
            this.f.e();
        }
        this.f = new atd_2(atd_22);
        this.f.a(Material.b);
        this.b = string;
        for (int k = 0; k < stringArray.length; ++k) {
            this.f.a(stringArray[k].hashCode());
        }
    }

    protected boolean a() {
        this.f.l();
        if (this.f.v() && !this.f.E()) {
            this.f.a(this.b);
            if (this.f.j()) {
                return false;
            }
            this.f.a(0, this.e, 0);
            return true;
        }
        return false;
    }

    public void a(String string, agw agw2) {
        this.h.a(new agv(this, string, agw2));
    }

    public void b() {
        this.g = true;
    }

    public final void c() {
        this.e.u();
        if (this.f != null) {
            this.f.e();
        }
    }
}

