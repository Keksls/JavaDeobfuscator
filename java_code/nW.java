/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

public final class nW
extends GeneratedMessageV3.Builder<nW>
implements nY {
    private int a;
    private Object b = "";
    private long c;
    private long d;
    private boolean e;
    private Object f = "null";
    private Object g = "";
    private int h;
    private int i;
    private long j;
    private int k;
    private int l;
    private int m;
    private long n;
    private Object o = "null";
    private int p;
    private int q;
    private int r;
    private long s;
    private Object t = "null";
    private boolean u;
    private Object v = "";
    private boolean w;
    private Object x = "";
    private boolean y;
    private long z = -1L;
    private long A = -1L;
    private int B;
    private long C = -1L;
    private MapField<Integer, Integer> D;

    public static final Descriptors.Descriptor a() {
        return nS.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 29: {
                return this.aZ();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 29: {
                return this.ba();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return nS.b.ensureFieldAccessorsInitialized(nU.class, nW.class);
    }

    nW() {
        this.aY();
    }

    nW(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.aY();
    }

    private void aY() {
        if (nU.av()) {
            // empty if block
        }
    }

    public nW ap() {
        super.clear();
        this.b = "";
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        this.e = false;
        this.a &= 0xFFFFFFF7;
        this.f = "null";
        this.a &= 0xFFFFFFEF;
        this.g = "";
        this.a &= 0xFFFFFFDF;
        this.h = 0;
        this.a &= 0xFFFFFFBF;
        this.i = 0;
        this.a &= 0xFFFFFF7F;
        this.j = 0L;
        this.a &= 0xFFFFFEFF;
        this.k = 0;
        this.a &= 0xFFFFFDFF;
        this.l = 0;
        this.a &= 0xFFFFFBFF;
        this.m = 0;
        this.a &= 0xFFFFF7FF;
        this.n = 0L;
        this.a &= 0xFFFFEFFF;
        this.o = "null";
        this.a &= 0xFFFFDFFF;
        this.p = 0;
        this.a &= 0xFFFFBFFF;
        this.q = 0;
        this.a &= 0xFFFF7FFF;
        this.r = 0;
        this.a &= 0xFFFEFFFF;
        this.s = 0L;
        this.a &= 0xFFFDFFFF;
        this.t = "null";
        this.a &= 0xFFFBFFFF;
        this.u = false;
        this.a &= 0xFFF7FFFF;
        this.v = "";
        this.a &= 0xFFEFFFFF;
        this.w = false;
        this.a &= 0xFFDFFFFF;
        this.x = "";
        this.a &= 0xFFBFFFFF;
        this.y = false;
        this.a &= 0xFF7FFFFF;
        this.z = -1L;
        this.a &= 0xFEFFFFFF;
        this.A = -1L;
        this.a &= 0xFDFFFFFF;
        this.B = 0;
        this.a &= 0xFBFFFFFF;
        this.C = -1L;
        this.a &= 0xF7FFFFFF;
        this.ba().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return nS.a;
    }

    public nU aq() {
        return nU.as();
    }

    public nU ar() {
        nU nU2 = this.as();
        if (!nU2.isInitialized()) {
            throw nW.newUninitializedMessageException((Message)nU2);
        }
        return nU2;
    }

    public nU as() {
        nU nU2 = new nU(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        nU2.G = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        nU2.H = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        nU2.I = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        nU2.J = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        nU2.K = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        nU2.L = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        nU2.M = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        nU2.N = this.i;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        nU2.O = this.j;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        nU2.P = this.k;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        nU2.Q = this.l;
        if ((n & 0x800) == 2048) {
            n2 |= 0x800;
        }
        nU2.R = this.m;
        if ((n & 0x1000) == 4096) {
            n2 |= 0x1000;
        }
        nU2.S = this.n;
        if ((n & 0x2000) == 8192) {
            n2 |= 0x2000;
        }
        nU2.T = this.o;
        if ((n & 0x4000) == 16384) {
            n2 |= 0x4000;
        }
        nU2.U = this.p;
        if ((n & 0x8000) == 32768) {
            n2 |= 0x8000;
        }
        nU2.V = this.q;
        if ((n & 0x10000) == 65536) {
            n2 |= 0x10000;
        }
        nU2.W = this.r;
        if ((n & 0x20000) == 131072) {
            n2 |= 0x20000;
        }
        nU2.X = this.s;
        if ((n & 0x40000) == 262144) {
            n2 |= 0x40000;
        }
        nU2.Y = this.t;
        if ((n & 0x80000) == 524288) {
            n2 |= 0x80000;
        }
        nU2.Z = this.u;
        if ((n & 0x100000) == 0x100000) {
            n2 |= 0x100000;
        }
        nU2.aa = this.v;
        if ((n & 0x200000) == 0x200000) {
            n2 |= 0x200000;
        }
        nU2.ab = this.w;
        if ((n & 0x400000) == 0x400000) {
            n2 |= 0x400000;
        }
        nU2.ac = this.x;
        if ((n & 0x800000) == 0x800000) {
            n2 |= 0x800000;
        }
        nU2.ad = this.y;
        if ((n & 0x1000000) == 0x1000000) {
            n2 |= 0x1000000;
        }
        nU2.ae = this.z;
        if ((n & 0x2000000) == 0x2000000) {
            n2 |= 0x2000000;
        }
        nU2.af = this.A;
        if ((n & 0x4000000) == 0x4000000) {
            n2 |= 0x4000000;
        }
        nU2.ag = this.B;
        if ((n & 0x8000000) == 0x8000000) {
            n2 |= 0x8000000;
        }
        nU2.ah = this.C;
        nU2.ai = this.aZ();
        nU2.ai.makeImmutable();
        nU2.F = n2;
        this.onBuilt();
        return nU2;
    }

    public nW at() {
        return (nW)super.clone();
    }

    public nW a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nW)super.setField(fieldDescriptor, object);
    }

    public nW a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nW)super.clearField(fieldDescriptor);
    }

    public nW a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nW)super.clearOneof(oneofDescriptor);
    }

    public nW a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nW)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nW b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nW)super.addRepeatedField(fieldDescriptor, object);
    }

    public nW a(Message message) {
        if (message instanceof nU) {
            return this.a((nU)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nW a(nU nU2) {
        if (nU2 == nU.as()) {
            return this;
        }
        if (nU2.b()) {
            this.a |= 1;
            this.b = nU2.G;
            this.onChanged();
        }
        if (nU2.e()) {
            this.a(nU2.f());
        }
        if (nU2.g()) {
            this.b(nU2.h());
        }
        if (nU2.i()) {
            this.a(nU2.j());
        }
        if (nU2.k()) {
            this.a |= 0x10;
            this.f = nU2.K;
            this.onChanged();
        }
        if (nU2.n()) {
            this.a |= 0x20;
            this.g = nU2.L;
            this.onChanged();
        }
        if (nU2.q()) {
            this.c(nU2.r());
        }
        if (nU2.s()) {
            this.d(nU2.t());
        }
        if (nU2.u()) {
            this.c(nU2.v());
        }
        if (nU2.w()) {
            this.e(nU2.x());
        }
        if (nU2.y()) {
            this.f(nU2.z());
        }
        if (nU2.A()) {
            this.g(nU2.B());
        }
        if (nU2.C()) {
            this.d(nU2.D());
        }
        if (nU2.E()) {
            this.a |= 0x2000;
            this.o = nU2.T;
            this.onChanged();
        }
        if (nU2.H()) {
            this.h(nU2.I());
        }
        if (nU2.J()) {
            this.i(nU2.K());
        }
        if (nU2.L()) {
            this.j(nU2.M());
        }
        if (nU2.N()) {
            this.e(nU2.O());
        }
        if (nU2.P()) {
            this.a |= 0x40000;
            this.t = nU2.Y;
            this.onChanged();
        }
        if (nU2.S()) {
            this.b(nU2.T());
        }
        if (nU2.U()) {
            this.a |= 0x100000;
            this.v = nU2.aa;
            this.onChanged();
        }
        if (nU2.X()) {
            this.c(nU2.Y());
        }
        if (nU2.Z()) {
            this.a |= 0x400000;
            this.x = nU2.ac;
            this.onChanged();
        }
        if (nU2.ac()) {
            this.d(nU2.ad());
        }
        if (nU2.ae()) {
            this.f(nU2.af());
        }
        if (nU2.ag()) {
            this.g(nU2.ah());
        }
        if (nU2.ai()) {
            this.k(nU2.aj());
        }
        if (nU2.ak()) {
            this.h(nU2.al());
        }
        this.ba().mergeFrom(nU2.aw());
        this.b(nU.b(nU2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.e()) {
            return false;
        }
        return this.g();
    }

    public nW a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        nU nU2 = null;
        try {
            nU2 = (nU)nU.D.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            nU2 = (nU)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (nU2 != null) {
                this.a(nU2);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public String c() {
        Object object = this.b;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.b = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString d() {
        Object object = this.b;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.b = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nW a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = string;
        this.onChanged();
        return this;
    }

    public nW au() {
        this.a &= 0xFFFFFFFE;
        this.b = nU.as().c();
        this.onChanged();
        return this;
    }

    public nW a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean e() {
        return (this.a & 2) == 2;
    }

    @Override
    public long f() {
        return this.c;
    }

    public nW a(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public nW av() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public long h() {
        return this.d;
    }

    public nW b(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public nW aw() {
        this.a &= 0xFFFFFFFB;
        this.d = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public boolean j() {
        return this.e;
    }

    public nW a(boolean bl) {
        this.a |= 8;
        this.e = bl;
        this.onChanged();
        return this;
    }

    public nW ax() {
        this.a &= 0xFFFFFFF7;
        this.e = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public String l() {
        Object object = this.f;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString m() {
        Object object = this.f;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.f = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nW b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x10;
        this.f = string;
        this.onChanged();
        return this;
    }

    public nW ay() {
        this.a &= 0xFFFFFFEF;
        this.f = nU.as().l();
        this.onChanged();
        return this;
    }

    public nW b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x10;
        this.f = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public String o() {
        Object object = this.g;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.g = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString p() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nW c(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x20;
        this.g = string;
        this.onChanged();
        return this;
    }

    public nW az() {
        this.a &= 0xFFFFFFDF;
        this.g = nU.as().o();
        this.onChanged();
        return this;
    }

    public nW c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x20;
        this.g = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean q() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public int r() {
        return this.h;
    }

    public nW c(int n) {
        this.a |= 0x40;
        this.h = n;
        this.onChanged();
        return this;
    }

    public nW aA() {
        this.a &= 0xFFFFFFBF;
        this.h = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean s() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public int t() {
        return this.i;
    }

    public nW d(int n) {
        this.a |= 0x80;
        this.i = n;
        this.onChanged();
        return this;
    }

    public nW aB() {
        this.a &= 0xFFFFFF7F;
        this.i = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean u() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public long v() {
        return this.j;
    }

    public nW c(long l) {
        this.a |= 0x100;
        this.j = l;
        this.onChanged();
        return this;
    }

    public nW aC() {
        this.a &= 0xFFFFFEFF;
        this.j = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean w() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public int x() {
        return this.k;
    }

    public nW e(int n) {
        this.a |= 0x200;
        this.k = n;
        this.onChanged();
        return this;
    }

    public nW aD() {
        this.a &= 0xFFFFFDFF;
        this.k = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean y() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public int z() {
        return this.l;
    }

    public nW f(int n) {
        this.a |= 0x400;
        this.l = n;
        this.onChanged();
        return this;
    }

    public nW aE() {
        this.a &= 0xFFFFFBFF;
        this.l = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean A() {
        return (this.a & 0x800) == 2048;
    }

    @Override
    public int B() {
        return this.m;
    }

    public nW g(int n) {
        this.a |= 0x800;
        this.m = n;
        this.onChanged();
        return this;
    }

    public nW aF() {
        this.a &= 0xFFFFF7FF;
        this.m = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean C() {
        return (this.a & 0x1000) == 4096;
    }

    @Override
    public long D() {
        return this.n;
    }

    public nW d(long l) {
        this.a |= 0x1000;
        this.n = l;
        this.onChanged();
        return this;
    }

    public nW aG() {
        this.a &= 0xFFFFEFFF;
        this.n = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean E() {
        return (this.a & 0x2000) == 8192;
    }

    @Override
    public String F() {
        Object object = this.o;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.o = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString G() {
        Object object = this.o;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.o = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nW d(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x2000;
        this.o = string;
        this.onChanged();
        return this;
    }

    public nW aH() {
        this.a &= 0xFFFFDFFF;
        this.o = nU.as().F();
        this.onChanged();
        return this;
    }

    public nW d(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x2000;
        this.o = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean H() {
        return (this.a & 0x4000) == 16384;
    }

    @Override
    public int I() {
        return this.p;
    }

    public nW h(int n) {
        this.a |= 0x4000;
        this.p = n;
        this.onChanged();
        return this;
    }

    public nW aI() {
        this.a &= 0xFFFFBFFF;
        this.p = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean J() {
        return (this.a & 0x8000) == 32768;
    }

    @Override
    public int K() {
        return this.q;
    }

    public nW i(int n) {
        this.a |= 0x8000;
        this.q = n;
        this.onChanged();
        return this;
    }

    public nW aJ() {
        this.a &= 0xFFFF7FFF;
        this.q = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean L() {
        return (this.a & 0x10000) == 65536;
    }

    @Override
    public int M() {
        return this.r;
    }

    public nW j(int n) {
        this.a |= 0x10000;
        this.r = n;
        this.onChanged();
        return this;
    }

    public nW aK() {
        this.a &= 0xFFFEFFFF;
        this.r = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean N() {
        return (this.a & 0x20000) == 131072;
    }

    @Override
    public long O() {
        return this.s;
    }

    public nW e(long l) {
        this.a |= 0x20000;
        this.s = l;
        this.onChanged();
        return this;
    }

    public nW aL() {
        this.a &= 0xFFFDFFFF;
        this.s = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean P() {
        return (this.a & 0x40000) == 262144;
    }

    @Override
    public String Q() {
        Object object = this.t;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.t = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString R() {
        Object object = this.t;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.t = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nW e(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x40000;
        this.t = string;
        this.onChanged();
        return this;
    }

    public nW aM() {
        this.a &= 0xFFFBFFFF;
        this.t = nU.as().Q();
        this.onChanged();
        return this;
    }

    public nW e(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x40000;
        this.t = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean S() {
        return (this.a & 0x80000) == 524288;
    }

    @Override
    public boolean T() {
        return this.u;
    }

    public nW b(boolean bl) {
        this.a |= 0x80000;
        this.u = bl;
        this.onChanged();
        return this;
    }

    public nW aN() {
        this.a &= 0xFFF7FFFF;
        this.u = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean U() {
        return (this.a & 0x100000) == 0x100000;
    }

    @Override
    public String V() {
        Object object = this.v;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.v = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString W() {
        Object object = this.v;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.v = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nW f(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x100000;
        this.v = string;
        this.onChanged();
        return this;
    }

    public nW aO() {
        this.a &= 0xFFEFFFFF;
        this.v = nU.as().V();
        this.onChanged();
        return this;
    }

    public nW f(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x100000;
        this.v = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean X() {
        return (this.a & 0x200000) == 0x200000;
    }

    @Override
    public boolean Y() {
        return this.w;
    }

    public nW c(boolean bl) {
        this.a |= 0x200000;
        this.w = bl;
        this.onChanged();
        return this;
    }

    public nW aP() {
        this.a &= 0xFFDFFFFF;
        this.w = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Z() {
        return (this.a & 0x400000) == 0x400000;
    }

    @Override
    public String aa() {
        Object object = this.x;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.x = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString ab() {
        Object object = this.x;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.x = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nW g(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x400000;
        this.x = string;
        this.onChanged();
        return this;
    }

    public nW aQ() {
        this.a &= 0xFFBFFFFF;
        this.x = nU.as().aa();
        this.onChanged();
        return this;
    }

    public nW g(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x400000;
        this.x = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ac() {
        return (this.a & 0x800000) == 0x800000;
    }

    @Override
    public boolean ad() {
        return this.y;
    }

    public nW d(boolean bl) {
        this.a |= 0x800000;
        this.y = bl;
        this.onChanged();
        return this;
    }

    public nW aR() {
        this.a &= 0xFF7FFFFF;
        this.y = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ae() {
        return (this.a & 0x1000000) == 0x1000000;
    }

    @Override
    public long af() {
        return this.z;
    }

    public nW f(long l) {
        this.a |= 0x1000000;
        this.z = l;
        this.onChanged();
        return this;
    }

    public nW aS() {
        this.a &= 0xFEFFFFFF;
        this.z = -1L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ag() {
        return (this.a & 0x2000000) == 0x2000000;
    }

    @Override
    public long ah() {
        return this.A;
    }

    public nW g(long l) {
        this.a |= 0x2000000;
        this.A = l;
        this.onChanged();
        return this;
    }

    public nW aT() {
        this.a &= 0xFDFFFFFF;
        this.A = -1L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ai() {
        return (this.a & 0x4000000) == 0x4000000;
    }

    @Override
    public int aj() {
        return this.B;
    }

    public nW k(int n) {
        this.a |= 0x4000000;
        this.B = n;
        this.onChanged();
        return this;
    }

    public nW aU() {
        this.a &= 0xFBFFFFFF;
        this.B = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ak() {
        return (this.a & 0x8000000) == 0x8000000;
    }

    @Override
    public long al() {
        return this.C;
    }

    public nW h(long l) {
        this.a |= 0x8000000;
        this.C = l;
        this.onChanged();
        return this;
    }

    public nW aV() {
        this.a &= 0xF7FFFFFF;
        this.C = -1L;
        this.onChanged();
        return this;
    }

    private MapField<Integer, Integer> aZ() {
        if (this.D == null) {
            return MapField.emptyMapField(nX.a);
        }
        return this.D;
    }

    private MapField<Integer, Integer> ba() {
        this.onChanged();
        if (this.D == null) {
            this.D = MapField.newMapField(nX.a);
        }
        if (!this.D.isMutable()) {
            this.D = this.D.copy();
        }
        return this.D;
    }

    @Override
    public int am() {
        return this.aZ().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.aZ().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, Integer> an() {
        return this.ao();
    }

    @Override
    public Map<Integer, Integer> ao() {
        return this.aZ().getMap();
    }

    @Override
    public int a(int n, int n2) {
        Map map = this.aZ().getMap();
        return map.containsKey(n) ? (Integer)map.get(n) : n2;
    }

    @Override
    public int b(int n) {
        Map map = this.aZ().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (Integer)map.get(n);
    }

    public nW aW() {
        this.ba().getMutableMap().clear();
        return this;
    }

    public nW l(int n) {
        this.ba().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, Integer> aX() {
        return this.ba().getMutableMap();
    }

    public nW b(int n, int n2) {
        this.ba().getMutableMap().put(n, n2);
        return this;
    }

    public nW a(Map<Integer, Integer> map) {
        this.ba().getMutableMap().putAll(map);
        return this;
    }

    public final nW a(UnknownFieldSet unknownFieldSet) {
        return (nW)super.setUnknownFields(unknownFieldSet);
    }

    public final nW b(UnknownFieldSet unknownFieldSet) {
        return (nW)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.ap();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.at();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.ap();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.at();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.at();
    }

    public /* synthetic */ Message buildPartial() {
        return this.as();
    }

    public /* synthetic */ Message build() {
        return this.ar();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ap();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.at();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.as();
    }

    public /* synthetic */ MessageLite build() {
        return this.ar();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ap();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.aq();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.aq();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.at();
    }

    public /* synthetic */ Object clone() {
        return this.at();
    }
}

