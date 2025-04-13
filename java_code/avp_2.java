/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.jogamp.opengl.cg.CGcontext
 *  com.jogamp.opengl.cg.CGeffect
 *  com.jogamp.opengl.cg.CGparameter
 *  com.jogamp.opengl.cg.CGtechnique
 *  com.jogamp.opengl.cg.CgGL
 *  org.apache.log4j.Logger
 */
import com.ankamagames.framework.graphics.engine.entity.Entity;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.jogamp.opengl.cg.CGcontext;
import com.jogamp.opengl.cg.CGeffect;
import com.jogamp.opengl.cg.CGparameter;
import com.jogamp.opengl.cg.CGtechnique;
import com.jogamp.opengl.cg.CgGL;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

/*
 * Renamed from avp
 */
public class avp_2
extends aug_1 {
    private static final boolean e = false;
    static final Logger f = Logger.getLogger(avp_2.class);
    private static final int g = 30;
    private static final LoadingCache<String, String> h = CacheBuilder.newBuilder().expireAfterAccess(30L, TimeUnit.SECONDS).build((CacheLoader)new avq_2());
    private final avb_1 i = new avr_2(this);
    private static CGcontext j;
    protected CGeffect c;
    final acy_2<avt_2> k = new acy_2(5);
    private static String l;

    @Override
    public void a(String string, String string2) {
        Object object;
        super.a(string, string2);
        if (l == null) {
            String string3 = gi_0.h(string2) + "/functions.cgfx";
            try {
                object = gg_0.b(string3);
            }
            catch (Exception exception) {
                f.error((Object)("Unable to read file functions: " + string3), (Throwable)exception);
                return;
            }
            l = new String((byte[])object);
        }
        try {
            object = (String)h.get((Object)string2);
        }
        catch (ExecutionException executionException) {
            f.error((Object)("Unable to load source file (" + string2 + ") in CACHE"));
            return;
        }
        if (object == null) {
            f.error((Object)("Unable to get source file (" + string2 + ")"));
            return;
        }
        this.c = CgGL.cgCreateEffect((CGcontext)j, (String)(l + (String)object), null);
        if (this.c == null) {
            f.error((Object)(CgGL.cgGetLastErrorString(null) + "\n(prendre en compte le nombre de ligne de functions.cgfx)"));
            f.error((Object)CgGL.cgGetLastListing((CGcontext)j));
        }
        this.i();
    }

    public static void g() {
        try {
            j = CgGL.cgCreateContext();
            CgGL.cgGLRegisterStates((CGcontext)j);
        }
        catch (NoClassDefFoundError noClassDefFoundError) {
            f.error((Object)"GlEffect not loaded : Cg library not loaded", (Throwable)noClassDefFoundError);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            f.error((Object)"GlEffect not loaded : Cg library not found", (Throwable)unsatisfiedLinkError);
        }
    }

    @Override
    public void a() {
        if (this.c != null) {
            CgGL.cgDestroyEffect((CGeffect)this.c);
        }
        super.a();
    }

    @Override
    public void b(String string, String string2) {
        super.b(string, string2);
        j = CgGL.cgCreateContext();
        CgGL.cgGLRegisterStates((CGcontext)j);
        this.c = CgGL.cgCreateEffect((CGcontext)j, (String)string2, null);
        this.i();
    }

    @Override
    public void e() {
        this.k.c();
        CGparameter cGparameter = CgGL.cgGetFirstEffectParameter((CGeffect)this.c);
        do {
            String string;
            if ((string = CgGL.cgGetParameterName((CGparameter)cGparameter)) == null || string.isEmpty()) continue;
            this.k.a(auc_1.c(string), new avt_2(string, cGparameter));
        } while ((cGparameter = CgGL.cgGetNextParameter((CGparameter)cGparameter)) != null);
    }

    @Override
    public final void a(aui_2 aui_22, Entity entity, ava_1 ava_12) {
        super.a(aui_22, entity, ava_12);
        if (this.d()) {
            axr_2.a().a(ava_12.a("gColorScale"));
            entity.a(aui_22);
        } else {
            if (ava_12 != null) {
                this.a(ava_12);
            }
            this.b.a(aui_22, entity);
        }
    }

    @Override
    protected final void a(ava_1 ava_12) {
        assert (ava_12 != null);
        ava_12.a(this.i);
    }

    private int h() {
        int n = 0;
        CGtechnique cGtechnique = CgGL.cgGetFirstTechnique((CGeffect)this.c);
        CgGL.cgGetTechniqueName((CGtechnique)cGtechnique);
        while (cGtechnique != null) {
            ++n;
            cGtechnique = CgGL.cgGetNextTechnique((CGtechnique)cGtechnique);
        }
        return n;
    }

    private void i() {
        this.a.c();
        if (!axy_2.b.c()) {
            return;
        }
        this.a.a(this.h());
        CGtechnique cGtechnique = CgGL.cgGetFirstTechnique((CGeffect)this.c);
        while (cGtechnique != null) {
            boolean bl = CgGL.cgValidateTechnique((CGtechnique)cGtechnique);
            avv_2 avv_22 = new avv_2(cGtechnique);
            int n = avv_22.a;
            if (bl) {
                this.a.a(n, avv_22);
            }
            cGtechnique = CgGL.cgGetNextTechnique((CGtechnique)cGtechnique);
        }
        this.e();
    }
}

