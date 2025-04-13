/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;

/*
 * Renamed from axx
 */
public enum axx_2 {
    a("GL render targets", "renderTargetsSupported"),
    b("GL multi-sampling", "multiSamplingSupported"),
    c("GL multi-texturing", "multiTexturingSupported"),
    d("GL texture compression", "textureCompressionSupported"),
    e("GL fragment shaders", "fragmentShadersSupported"),
    f("Cg GL fragment shaders", "cgFragmentShadersSupported"),
    g("GL vertex shaders", "vertexShadersSupported"),
    h("Cg GL vertex shaders", "cgVertexShadersSupported"),
    i("GL texture non power of two", "textureNonPowerOfTwo"),
    j("GL compressed text image 2d fonction", "glCompressedTextImage2D"),
    k("OpenGL driver in use are faulty AMD Adrenalin driver", "glAMDAdrenalinArtefactTearing"),
    l("AL effects", "alEffectsSupported"),
    m("AL filters", "alFiltersSupported");

    private static final HashMap<String, axx_2> n;
    private final String o;
    private final String p;

    private axx_2(String string2, String string3) {
        this.o = string2;
        this.p = string3;
    }

    public String a() {
        return this.o;
    }

    public String b() {
        return this.p;
    }

    public static axx_2 a(String string) {
        return n.get(string);
    }

    static {
        n = new HashMap();
        for (axx_2 axx_22 : axx_2.values()) {
            n.put(axx_22.b(), axx_22);
        }
    }
}

