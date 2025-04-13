/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
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
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

public final class is
extends GeneratedMessageV3.Builder<is>
implements it_0 {
    private int a;
    private ByteString b = ByteString.EMPTY;
    private int c;
    private int d;
    private int e;
    private long f;
    private int g;
    private ik_0 h = null;
    private SingleFieldBuilderV3<ik_0, im_0, in_0> i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private long o;
    private long p;
    private ik_0 q = null;
    private SingleFieldBuilderV3<ik_0, im_0, in_0> r;
    private float s;
    private int t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    private boolean A;
    private long B;
    private ig_0 C = null;
    private SingleFieldBuilderV3<ig_0, ii_0, ij_0> D;
    private zt_2 E = null;
    private SingleFieldBuilderV3<zt_2, zv_2, zw_2> F;

    public static final Descriptors.Descriptor a() {
        return io_0.k;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return io_0.l.ensureFieldAccessorsInitialized(iq_0.class, is.class);
    }

    is() {
        this.aR();
    }

    is(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.aR();
    }

    private void aR() {
        if (iq_0.an()) {
            this.aS();
            this.aT();
            this.aU();
            this.aV();
        }
    }

    public is ah() {
        super.clear();
        this.b = ByteString.EMPTY;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = 0L;
        this.a &= 0xFFFFFFEF;
        this.g = 0;
        this.a &= 0xFFFFFFDF;
        if (this.i == null) {
            this.h = null;
        } else {
            this.i.clear();
        }
        this.a &= 0xFFFFFFBF;
        this.j = 0;
        this.a &= 0xFFFFFF7F;
        this.k = false;
        this.a &= 0xFFFFFEFF;
        this.l = false;
        this.a &= 0xFFFFFDFF;
        this.m = 0;
        this.a &= 0xFFFFFBFF;
        this.n = 0;
        this.a &= 0xFFFFF7FF;
        this.o = 0L;
        this.a &= 0xFFFFEFFF;
        this.p = 0L;
        this.a &= 0xFFFFDFFF;
        if (this.r == null) {
            this.q = null;
        } else {
            this.r.clear();
        }
        this.a &= 0xFFFFBFFF;
        this.s = 0.0f;
        this.a &= 0xFFFF7FFF;
        this.t = 0;
        this.a &= 0xFFFEFFFF;
        this.u = false;
        this.a &= 0xFFFDFFFF;
        this.v = false;
        this.a &= 0xFFFBFFFF;
        this.w = false;
        this.a &= 0xFFF7FFFF;
        this.x = false;
        this.a &= 0xFFEFFFFF;
        this.y = false;
        this.a &= 0xFFDFFFFF;
        this.z = false;
        this.a &= 0xFFBFFFFF;
        this.A = false;
        this.a &= 0xFF7FFFFF;
        this.B = 0L;
        this.a &= 0xFEFFFFFF;
        if (this.D == null) {
            this.C = null;
        } else {
            this.D.clear();
        }
        this.a &= 0xFDFFFFFF;
        if (this.F == null) {
            this.E = null;
        } else {
            this.F.clear();
        }
        this.a &= 0xFBFFFFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return io_0.k;
    }

    public iq_0 ai() {
        return iq_0.ak();
    }

    public iq_0 aj() {
        iq_0 iq_02 = this.ak();
        if (!iq_02.isInitialized()) {
            throw is.newUninitializedMessageException((Message)iq_02);
        }
        return iq_02;
    }

    public iq_0 ak() {
        iq_0 iq_02 = new iq_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        iq_02.E = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        iq_02.F = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        iq_02.G = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        iq_02.H = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        iq_02.I = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        iq_02.J = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        iq_02.K = this.i == null ? this.h : (ik_0)this.i.build();
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        iq_02.L = this.j;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        iq_02.M = this.k;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        iq_02.N = this.l;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        iq_02.O = this.m;
        if ((n & 0x800) == 2048) {
            n2 |= 0x800;
        }
        iq_02.P = this.n;
        if ((n & 0x1000) == 4096) {
            n2 |= 0x1000;
        }
        iq_02.Q = this.o;
        if ((n & 0x2000) == 8192) {
            n2 |= 0x2000;
        }
        iq_02.R = this.p;
        if ((n & 0x4000) == 16384) {
            n2 |= 0x4000;
        }
        iq_02.S = this.r == null ? this.q : (ik_0)this.r.build();
        if ((n & 0x8000) == 32768) {
            n2 |= 0x8000;
        }
        iq_02.T = this.s;
        if ((n & 0x10000) == 65536) {
            n2 |= 0x10000;
        }
        iq_02.U = this.t;
        if ((n & 0x20000) == 131072) {
            n2 |= 0x20000;
        }
        iq_02.V = this.u;
        if ((n & 0x40000) == 262144) {
            n2 |= 0x40000;
        }
        iq_02.W = this.v;
        if ((n & 0x80000) == 524288) {
            n2 |= 0x80000;
        }
        iq_02.X = this.w;
        if ((n & 0x100000) == 0x100000) {
            n2 |= 0x100000;
        }
        iq_02.Y = this.x;
        if ((n & 0x200000) == 0x200000) {
            n2 |= 0x200000;
        }
        iq_02.Z = this.y;
        if ((n & 0x400000) == 0x400000) {
            n2 |= 0x400000;
        }
        iq_02.aa = this.z;
        if ((n & 0x800000) == 0x800000) {
            n2 |= 0x800000;
        }
        iq_02.ab = this.A;
        if ((n & 0x1000000) == 0x1000000) {
            n2 |= 0x1000000;
        }
        iq_02.ac = this.B;
        if ((n & 0x2000000) == 0x2000000) {
            n2 |= 0x2000000;
        }
        iq_02.ad = this.D == null ? this.C : (ig_0)this.D.build();
        if ((n & 0x4000000) == 0x4000000) {
            n2 |= 0x4000000;
        }
        iq_02.ae = this.F == null ? this.E : (zt_2)this.F.build();
        iq_02.D = n2;
        this.onBuilt();
        return iq_02;
    }

    public is al() {
        return (is)super.clone();
    }

    public is a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (is)super.setField(fieldDescriptor, object);
    }

    public is a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (is)super.clearField(fieldDescriptor);
    }

    public is a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (is)super.clearOneof(oneofDescriptor);
    }

    public is a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (is)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public is b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (is)super.addRepeatedField(fieldDescriptor, object);
    }

    public is a(Message message) {
        if (message instanceof iq_0) {
            return this.a((iq_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public is a(iq_0 iq_02) {
        if (iq_02 == iq_0.ak()) {
            return this;
        }
        if (iq_02.b()) {
            this.a(iq_02.c());
        }
        if (iq_02.d()) {
            this.a(iq_02.e());
        }
        if (iq_02.f()) {
            this.b(iq_02.g());
        }
        if (iq_02.h()) {
            this.c(iq_02.i());
        }
        if (iq_02.j()) {
            this.a(iq_02.k());
        }
        if (iq_02.l()) {
            this.d(iq_02.m());
        }
        if (iq_02.n()) {
            this.b(iq_02.o());
        }
        if (iq_02.q()) {
            this.e(iq_02.r());
        }
        if (iq_02.s()) {
            this.a(iq_02.t());
        }
        if (iq_02.u()) {
            this.b(iq_02.v());
        }
        if (iq_02.w()) {
            this.f(iq_02.x());
        }
        if (iq_02.y()) {
            this.g(iq_02.z());
        }
        if (iq_02.A()) {
            this.b(iq_02.B());
        }
        if (iq_02.C()) {
            this.c(iq_02.D());
        }
        if (iq_02.E()) {
            this.d(iq_02.F());
        }
        if (iq_02.H()) {
            this.a(iq_02.I());
        }
        if (iq_02.J()) {
            this.h(iq_02.K());
        }
        if (iq_02.L()) {
            this.c(iq_02.M());
        }
        if (iq_02.N()) {
            this.d(iq_02.O());
        }
        if (iq_02.P()) {
            this.e(iq_02.Q());
        }
        if (iq_02.R()) {
            this.f(iq_02.S());
        }
        if (iq_02.T()) {
            this.g(iq_02.U());
        }
        if (iq_02.V()) {
            this.h(iq_02.W());
        }
        if (iq_02.X()) {
            this.i(iq_02.Y());
        }
        if (iq_02.Z()) {
            this.d(iq_02.aa());
        }
        if (iq_02.ab()) {
            this.b(iq_02.ac());
        }
        if (iq_02.ae()) {
            this.b(iq_02.af());
        }
        this.b(iq_0.b(iq_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (this.n() && !this.o().isInitialized()) {
            return false;
        }
        if (this.E() && !this.F().isInitialized()) {
            return false;
        }
        if (this.ab() && !this.ac().isInitialized()) {
            return false;
        }
        return !this.ae() || this.af().isInitialized();
    }

    public is a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        iq_0 iq_02 = null;
        try {
            iq_02 = (iq_0)iq_0.B.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            iq_02 = (iq_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (iq_02 != null) {
                this.a(iq_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public ByteString c() {
        return this.b;
    }

    public is a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = byteString;
        this.onChanged();
        return this;
    }

    public is am() {
        this.a &= 0xFFFFFFFE;
        this.b = iq_0.ak().c();
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public int e() {
        return this.c;
    }

    public is a(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public is an() {
        this.a &= 0xFFFFFFFD;
        this.c = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean f() {
        return (this.a & 4) == 4;
    }

    @Override
    public int g() {
        return this.d;
    }

    public is b(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public is ao() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public int i() {
        return this.e;
    }

    public is c(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public is ap() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean j() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public long k() {
        return this.f;
    }

    public is a(long l) {
        this.a |= 0x10;
        this.f = l;
        this.onChanged();
        return this;
    }

    public is aq() {
        this.a &= 0xFFFFFFEF;
        this.f = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean l() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public int m() {
        return this.g;
    }

    public is d(int n) {
        this.a |= 0x20;
        this.g = n;
        this.onChanged();
        return this;
    }

    public is ar() {
        this.a &= 0xFFFFFFDF;
        this.g = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public ik_0 o() {
        if (this.i == null) {
            return this.h == null ? ik_0.k() : this.h;
        }
        return (ik_0)this.i.getMessage();
    }

    public is a(ik_0 ik_02) {
        if (this.i == null) {
            if (ik_02 == null) {
                throw new NullPointerException();
            }
            this.h = ik_02;
            this.onChanged();
        } else {
            this.i.setMessage((AbstractMessage)ik_02);
        }
        this.a |= 0x40;
        return this;
    }

    public is a(im_0 im_02) {
        if (this.i == null) {
            this.h = im_02.j();
            this.onChanged();
        } else {
            this.i.setMessage((AbstractMessage)im_02.j());
        }
        this.a |= 0x40;
        return this;
    }

    public is b(ik_0 ik_02) {
        if (this.i == null) {
            this.h = (this.a & 0x40) == 64 && this.h != null && this.h != ik_0.k() ? ik_0.a(this.h).a(ik_02).k() : ik_02;
            this.onChanged();
        } else {
            this.i.mergeFrom((AbstractMessage)ik_02);
        }
        this.a |= 0x40;
        return this;
    }

    public is as() {
        if (this.i == null) {
            this.h = null;
            this.onChanged();
        } else {
            this.i.clear();
        }
        this.a &= 0xFFFFFFBF;
        return this;
    }

    public im_0 at() {
        this.a |= 0x40;
        this.onChanged();
        return (im_0)this.aS().getBuilder();
    }

    @Override
    public in_0 p() {
        if (this.i != null) {
            return (in_0)this.i.getMessageOrBuilder();
        }
        return this.h == null ? ik_0.k() : this.h;
    }

    private SingleFieldBuilderV3<ik_0, im_0, in_0> aS() {
        if (this.i == null) {
            this.i = new SingleFieldBuilderV3((AbstractMessage)this.o(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.h = null;
        }
        return this.i;
    }

    @Override
    public boolean q() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public int r() {
        return this.j;
    }

    public is e(int n) {
        this.a |= 0x80;
        this.j = n;
        this.onChanged();
        return this;
    }

    public is au() {
        this.a &= 0xFFFFFF7F;
        this.j = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean s() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public boolean t() {
        return this.k;
    }

    public is a(boolean bl) {
        this.a |= 0x100;
        this.k = bl;
        this.onChanged();
        return this;
    }

    public is av() {
        this.a &= 0xFFFFFEFF;
        this.k = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean u() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public boolean v() {
        return this.l;
    }

    public is b(boolean bl) {
        this.a |= 0x200;
        this.l = bl;
        this.onChanged();
        return this;
    }

    public is aw() {
        this.a &= 0xFFFFFDFF;
        this.l = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean w() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public int x() {
        return this.m;
    }

    public is f(int n) {
        this.a |= 0x400;
        this.m = n;
        this.onChanged();
        return this;
    }

    public is ax() {
        this.a &= 0xFFFFFBFF;
        this.m = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean y() {
        return (this.a & 0x800) == 2048;
    }

    @Override
    public int z() {
        return this.n;
    }

    public is g(int n) {
        this.a |= 0x800;
        this.n = n;
        this.onChanged();
        return this;
    }

    public is ay() {
        this.a &= 0xFFFFF7FF;
        this.n = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean A() {
        return (this.a & 0x1000) == 4096;
    }

    @Override
    public long B() {
        return this.o;
    }

    public is b(long l) {
        this.a |= 0x1000;
        this.o = l;
        this.onChanged();
        return this;
    }

    public is az() {
        this.a &= 0xFFFFEFFF;
        this.o = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean C() {
        return (this.a & 0x2000) == 8192;
    }

    @Override
    public long D() {
        return this.p;
    }

    public is c(long l) {
        this.a |= 0x2000;
        this.p = l;
        this.onChanged();
        return this;
    }

    public is aA() {
        this.a &= 0xFFFFDFFF;
        this.p = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean E() {
        return (this.a & 0x4000) == 16384;
    }

    @Override
    public ik_0 F() {
        if (this.r == null) {
            return this.q == null ? ik_0.k() : this.q;
        }
        return (ik_0)this.r.getMessage();
    }

    public is c(ik_0 ik_02) {
        if (this.r == null) {
            if (ik_02 == null) {
                throw new NullPointerException();
            }
            this.q = ik_02;
            this.onChanged();
        } else {
            this.r.setMessage((AbstractMessage)ik_02);
        }
        this.a |= 0x4000;
        return this;
    }

    public is b(im_0 im_02) {
        if (this.r == null) {
            this.q = im_02.j();
            this.onChanged();
        } else {
            this.r.setMessage((AbstractMessage)im_02.j());
        }
        this.a |= 0x4000;
        return this;
    }

    public is d(ik_0 ik_02) {
        if (this.r == null) {
            this.q = (this.a & 0x4000) == 16384 && this.q != null && this.q != ik_0.k() ? ik_0.a(this.q).a(ik_02).k() : ik_02;
            this.onChanged();
        } else {
            this.r.mergeFrom((AbstractMessage)ik_02);
        }
        this.a |= 0x4000;
        return this;
    }

    public is aB() {
        if (this.r == null) {
            this.q = null;
            this.onChanged();
        } else {
            this.r.clear();
        }
        this.a &= 0xFFFFBFFF;
        return this;
    }

    public im_0 aC() {
        this.a |= 0x4000;
        this.onChanged();
        return (im_0)this.aT().getBuilder();
    }

    @Override
    public in_0 G() {
        if (this.r != null) {
            return (in_0)this.r.getMessageOrBuilder();
        }
        return this.q == null ? ik_0.k() : this.q;
    }

    private SingleFieldBuilderV3<ik_0, im_0, in_0> aT() {
        if (this.r == null) {
            this.r = new SingleFieldBuilderV3((AbstractMessage)this.F(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.q = null;
        }
        return this.r;
    }

    @Override
    public boolean H() {
        return (this.a & 0x8000) == 32768;
    }

    @Override
    public float I() {
        return this.s;
    }

    public is a(float f2) {
        this.a |= 0x8000;
        this.s = f2;
        this.onChanged();
        return this;
    }

    public is aD() {
        this.a &= 0xFFFF7FFF;
        this.s = 0.0f;
        this.onChanged();
        return this;
    }

    @Override
    public boolean J() {
        return (this.a & 0x10000) == 65536;
    }

    @Override
    public int K() {
        return this.t;
    }

    public is h(int n) {
        this.a |= 0x10000;
        this.t = n;
        this.onChanged();
        return this;
    }

    public is aE() {
        this.a &= 0xFFFEFFFF;
        this.t = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean L() {
        return (this.a & 0x20000) == 131072;
    }

    @Override
    public boolean M() {
        return this.u;
    }

    public is c(boolean bl) {
        this.a |= 0x20000;
        this.u = bl;
        this.onChanged();
        return this;
    }

    public is aF() {
        this.a &= 0xFFFDFFFF;
        this.u = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean N() {
        return (this.a & 0x40000) == 262144;
    }

    @Override
    public boolean O() {
        return this.v;
    }

    public is d(boolean bl) {
        this.a |= 0x40000;
        this.v = bl;
        this.onChanged();
        return this;
    }

    public is aG() {
        this.a &= 0xFFFBFFFF;
        this.v = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean P() {
        return (this.a & 0x80000) == 524288;
    }

    @Override
    public boolean Q() {
        return this.w;
    }

    public is e(boolean bl) {
        this.a |= 0x80000;
        this.w = bl;
        this.onChanged();
        return this;
    }

    public is aH() {
        this.a &= 0xFFF7FFFF;
        this.w = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean R() {
        return (this.a & 0x100000) == 0x100000;
    }

    @Override
    public boolean S() {
        return this.x;
    }

    public is f(boolean bl) {
        this.a |= 0x100000;
        this.x = bl;
        this.onChanged();
        return this;
    }

    public is aI() {
        this.a &= 0xFFEFFFFF;
        this.x = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean T() {
        return (this.a & 0x200000) == 0x200000;
    }

    @Override
    public boolean U() {
        return this.y;
    }

    public is g(boolean bl) {
        this.a |= 0x200000;
        this.y = bl;
        this.onChanged();
        return this;
    }

    public is aJ() {
        this.a &= 0xFFDFFFFF;
        this.y = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean V() {
        return (this.a & 0x400000) == 0x400000;
    }

    @Override
    public boolean W() {
        return this.z;
    }

    public is h(boolean bl) {
        this.a |= 0x400000;
        this.z = bl;
        this.onChanged();
        return this;
    }

    public is aK() {
        this.a &= 0xFFBFFFFF;
        this.z = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean X() {
        return (this.a & 0x800000) == 0x800000;
    }

    @Override
    public boolean Y() {
        return this.A;
    }

    public is i(boolean bl) {
        this.a |= 0x800000;
        this.A = bl;
        this.onChanged();
        return this;
    }

    public is aL() {
        this.a &= 0xFF7FFFFF;
        this.A = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean Z() {
        return (this.a & 0x1000000) == 0x1000000;
    }

    @Override
    public long aa() {
        return this.B;
    }

    public is d(long l) {
        this.a |= 0x1000000;
        this.B = l;
        this.onChanged();
        return this;
    }

    public is aM() {
        this.a &= 0xFEFFFFFF;
        this.B = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean ab() {
        return (this.a & 0x2000000) == 0x2000000;
    }

    @Override
    public ig_0 ac() {
        if (this.D == null) {
            return this.C == null ? ig_0.h() : this.C;
        }
        return (ig_0)this.D.getMessage();
    }

    public is a(ig_0 ig_02) {
        if (this.D == null) {
            if (ig_02 == null) {
                throw new NullPointerException();
            }
            this.C = ig_02;
            this.onChanged();
        } else {
            this.D.setMessage((AbstractMessage)ig_02);
        }
        this.a |= 0x2000000;
        return this;
    }

    public is a(ii_0 ii_02) {
        if (this.D == null) {
            this.C = ii_02.g();
            this.onChanged();
        } else {
            this.D.setMessage((AbstractMessage)ii_02.g());
        }
        this.a |= 0x2000000;
        return this;
    }

    public is b(ig_0 ig_02) {
        if (this.D == null) {
            this.C = (this.a & 0x2000000) == 0x2000000 && this.C != null && this.C != ig_0.h() ? ig_0.a(this.C).a(ig_02).h() : ig_02;
            this.onChanged();
        } else {
            this.D.mergeFrom((AbstractMessage)ig_02);
        }
        this.a |= 0x2000000;
        return this;
    }

    public is aN() {
        if (this.D == null) {
            this.C = null;
            this.onChanged();
        } else {
            this.D.clear();
        }
        this.a &= 0xFDFFFFFF;
        return this;
    }

    public ii_0 aO() {
        this.a |= 0x2000000;
        this.onChanged();
        return (ii_0)this.aU().getBuilder();
    }

    @Override
    public ij_0 ad() {
        if (this.D != null) {
            return (ij_0)this.D.getMessageOrBuilder();
        }
        return this.C == null ? ig_0.h() : this.C;
    }

    private SingleFieldBuilderV3<ig_0, ii_0, ij_0> aU() {
        if (this.D == null) {
            this.D = new SingleFieldBuilderV3((AbstractMessage)this.ac(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.C = null;
        }
        return this.D;
    }

    @Override
    public boolean ae() {
        return (this.a & 0x4000000) == 0x4000000;
    }

    @Override
    public zt_2 af() {
        if (this.F == null) {
            return this.E == null ? zt_2.h() : this.E;
        }
        return (zt_2)this.F.getMessage();
    }

    public is a(zt_2 zt_22) {
        if (this.F == null) {
            if (zt_22 == null) {
                throw new NullPointerException();
            }
            this.E = zt_22;
            this.onChanged();
        } else {
            this.F.setMessage((AbstractMessage)zt_22);
        }
        this.a |= 0x4000000;
        return this;
    }

    public is a(zv_2 zv_22) {
        if (this.F == null) {
            this.E = zv_22.g();
            this.onChanged();
        } else {
            this.F.setMessage((AbstractMessage)zv_22.g());
        }
        this.a |= 0x4000000;
        return this;
    }

    public is b(zt_2 zt_22) {
        if (this.F == null) {
            this.E = (this.a & 0x4000000) == 0x4000000 && this.E != null && this.E != zt_2.h() ? zt_2.a(this.E).a(zt_22).h() : zt_22;
            this.onChanged();
        } else {
            this.F.mergeFrom((AbstractMessage)zt_22);
        }
        this.a |= 0x4000000;
        return this;
    }

    public is aP() {
        if (this.F == null) {
            this.E = null;
            this.onChanged();
        } else {
            this.F.clear();
        }
        this.a &= 0xFBFFFFFF;
        return this;
    }

    public zv_2 aQ() {
        this.a |= 0x4000000;
        this.onChanged();
        return (zv_2)this.aV().getBuilder();
    }

    @Override
    public zw_2 ag() {
        if (this.F != null) {
            return (zw_2)this.F.getMessageOrBuilder();
        }
        return this.E == null ? zt_2.h() : this.E;
    }

    private SingleFieldBuilderV3<zt_2, zv_2, zw_2> aV() {
        if (this.F == null) {
            this.F = new SingleFieldBuilderV3((AbstractMessage)this.af(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.E = null;
        }
        return this.F;
    }

    public final is a(UnknownFieldSet unknownFieldSet) {
        return (is)super.setUnknownFields(unknownFieldSet);
    }

    public final is b(UnknownFieldSet unknownFieldSet) {
        return (is)super.mergeUnknownFields(unknownFieldSet);
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
        return this.ah();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.al();
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
        return this.ah();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.al();
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
        return this.al();
    }

    public /* synthetic */ Message buildPartial() {
        return this.ak();
    }

    public /* synthetic */ Message build() {
        return this.aj();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.ah();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.al();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.ak();
    }

    public /* synthetic */ MessageLite build() {
        return this.aj();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.ah();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.ai();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.ai();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.al();
    }

    public /* synthetic */ Object clone() {
        return this.al();
    }
}

