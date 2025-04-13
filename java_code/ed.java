/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessageLite$Builder
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
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

public final class ed
extends GeneratedMessageV3.Builder<ed>
implements ee {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private int q;

    public static final Descriptors.Descriptor a() {
        return dZ.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dZ.b.ensureFieldAccessorsInitialized(eb.class, ed.class);
    }

    ed() {
        this.ac();
    }

    ed(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.ac();
    }

    private void ac() {
        if (eb.N()) {
            // empty if block
        }
    }

    public ed H() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = 0;
        this.a &= 0xFFFFFFDF;
        this.h = 0;
        this.a &= 0xFFFFFFBF;
        this.i = 0;
        this.a &= 0xFFFFFF7F;
        this.j = 0;
        this.a &= 0xFFFFFEFF;
        this.k = 0;
        this.a &= 0xFFFFFDFF;
        this.l = 0;
        this.a &= 0xFFFFFBFF;
        this.m = 0;
        this.a &= 0xFFFFF7FF;
        this.n = 0;
        this.a &= 0xFFFFEFFF;
        this.o = 0;
        this.a &= 0xFFFFDFFF;
        this.p = 0;
        this.a &= 0xFFFFBFFF;
        this.q = 0;
        this.a &= 0xFFFF7FFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return dZ.a;
    }

    public eb I() {
        return eb.K();
    }

    public eb J() {
        eb eb2 = this.K();
        if (!eb2.isInitialized()) {
            throw ed.newUninitializedMessageException((Message)eb2);
        }
        return eb2;
    }

    public eb K() {
        eb eb2 = new eb(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        eb2.t = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        eb2.u = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        eb2.v = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        eb2.w = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        eb2.x = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        eb2.y = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        eb2.z = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        eb2.A = this.i;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        eb2.B = this.j;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        eb2.C = this.k;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        eb2.D = this.l;
        if ((n & 0x800) == 2048) {
            n2 |= 0x800;
        }
        eb2.E = this.m;
        if ((n & 0x1000) == 4096) {
            n2 |= 0x1000;
        }
        eb2.F = this.n;
        if ((n & 0x2000) == 8192) {
            n2 |= 0x2000;
        }
        eb2.G = this.o;
        if ((n & 0x4000) == 16384) {
            n2 |= 0x4000;
        }
        eb2.H = this.p;
        if ((n & 0x8000) == 32768) {
            n2 |= 0x8000;
        }
        eb2.I = this.q;
        eb2.s = n2;
        this.onBuilt();
        return eb2;
    }

    public ed L() {
        return (ed)super.clone();
    }

    public ed a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ed)super.setField(fieldDescriptor, object);
    }

    public ed a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ed)super.clearField(fieldDescriptor);
    }

    public ed a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ed)super.clearOneof(oneofDescriptor);
    }

    public ed a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ed)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ed b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ed)super.addRepeatedField(fieldDescriptor, object);
    }

    public ed a(Message message) {
        if (message instanceof eb) {
            return this.a((eb)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ed a(eb eb2) {
        if (eb2 == eb.K()) {
            return this;
        }
        if (eb2.b()) {
            this.a(eb2.c());
        }
        if (eb2.d()) {
            this.b(eb2.e());
        }
        if (eb2.f()) {
            this.c(eb2.g());
        }
        if (eb2.h()) {
            this.d(eb2.i());
        }
        if (eb2.j()) {
            this.e(eb2.k());
        }
        if (eb2.l()) {
            this.f(eb2.m());
        }
        if (eb2.n()) {
            this.g(eb2.o());
        }
        if (eb2.p()) {
            this.h(eb2.q());
        }
        if (eb2.r()) {
            this.i(eb2.s());
        }
        if (eb2.t()) {
            this.j(eb2.u());
        }
        if (eb2.v()) {
            this.k(eb2.w());
        }
        if (eb2.x()) {
            this.l(eb2.y());
        }
        if (eb2.z()) {
            this.m(eb2.A());
        }
        if (eb2.B()) {
            this.n(eb2.C());
        }
        if (eb2.D()) {
            this.o(eb2.E());
        }
        if (eb2.F()) {
            this.p(eb2.G());
        }
        this.b(eb.b(eb2));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        if (!this.h()) {
            return false;
        }
        if (!this.j()) {
            return false;
        }
        if (!this.l()) {
            return false;
        }
        if (!this.n()) {
            return false;
        }
        if (!this.p()) {
            return false;
        }
        if (!this.r()) {
            return false;
        }
        if (!this.t()) {
            return false;
        }
        if (!this.v()) {
            return false;
        }
        return this.x();
    }

    public ed a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        eb eb2 = null;
        try {
            eb2 = (eb)eb.q.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            eb2 = (eb)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (eb2 != null) {
                this.a(eb2);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public int c() {
        return this.b;
    }

    public ed a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public ed M() {
        this.a &= 0xFFFFFFFE;
        this.b = 0;
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

    public ed b(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public ed N() {
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

    public ed c(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public ed O() {
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

    public ed d(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public ed P() {
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
    public int k() {
        return this.f;
    }

    public ed e(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public ed Q() {
        this.a &= 0xFFFFFFEF;
        this.f = 0;
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

    public ed f(int n) {
        this.a |= 0x20;
        this.g = n;
        this.onChanged();
        return this;
    }

    public ed R() {
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
    public int o() {
        return this.h;
    }

    public ed g(int n) {
        this.a |= 0x40;
        this.h = n;
        this.onChanged();
        return this;
    }

    public ed S() {
        this.a &= 0xFFFFFFBF;
        this.h = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean p() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public int q() {
        return this.i;
    }

    public ed h(int n) {
        this.a |= 0x80;
        this.i = n;
        this.onChanged();
        return this;
    }

    public ed T() {
        this.a &= 0xFFFFFF7F;
        this.i = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean r() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public int s() {
        return this.j;
    }

    public ed i(int n) {
        this.a |= 0x100;
        this.j = n;
        this.onChanged();
        return this;
    }

    public ed U() {
        this.a &= 0xFFFFFEFF;
        this.j = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean t() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public int u() {
        return this.k;
    }

    public ed j(int n) {
        this.a |= 0x200;
        this.k = n;
        this.onChanged();
        return this;
    }

    public ed V() {
        this.a &= 0xFFFFFDFF;
        this.k = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean v() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public int w() {
        return this.l;
    }

    public ed k(int n) {
        this.a |= 0x400;
        this.l = n;
        this.onChanged();
        return this;
    }

    public ed W() {
        this.a &= 0xFFFFFBFF;
        this.l = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean x() {
        return (this.a & 0x800) == 2048;
    }

    @Override
    public int y() {
        return this.m;
    }

    public ed l(int n) {
        this.a |= 0x800;
        this.m = n;
        this.onChanged();
        return this;
    }

    public ed X() {
        this.a &= 0xFFFFF7FF;
        this.m = 0;
        this.onChanged();
        return this;
    }

    @Override
    @Deprecated
    public boolean z() {
        return (this.a & 0x1000) == 4096;
    }

    @Override
    @Deprecated
    public int A() {
        return this.n;
    }

    @Deprecated
    public ed m(int n) {
        this.a |= 0x1000;
        this.n = n;
        this.onChanged();
        return this;
    }

    @Deprecated
    public ed Y() {
        this.a &= 0xFFFFEFFF;
        this.n = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean B() {
        return (this.a & 0x2000) == 8192;
    }

    @Override
    public int C() {
        return this.o;
    }

    public ed n(int n) {
        this.a |= 0x2000;
        this.o = n;
        this.onChanged();
        return this;
    }

    public ed Z() {
        this.a &= 0xFFFFDFFF;
        this.o = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean D() {
        return (this.a & 0x4000) == 16384;
    }

    @Override
    public int E() {
        return this.p;
    }

    public ed o(int n) {
        this.a |= 0x4000;
        this.p = n;
        this.onChanged();
        return this;
    }

    public ed aa() {
        this.a &= 0xFFFFBFFF;
        this.p = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean F() {
        return (this.a & 0x8000) == 32768;
    }

    @Override
    public int G() {
        return this.q;
    }

    public ed p(int n) {
        this.a |= 0x8000;
        this.q = n;
        this.onChanged();
        return this;
    }

    public ed ab() {
        this.a &= 0xFFFF7FFF;
        this.q = 0;
        this.onChanged();
        return this;
    }

    public final ed a(UnknownFieldSet unknownFieldSet) {
        return (ed)super.setUnknownFields(unknownFieldSet);
    }

    public final ed b(UnknownFieldSet unknownFieldSet) {
        return (ed)super.mergeUnknownFields(unknownFieldSet);
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
        return this.H();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.L();
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
        return this.H();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.L();
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
        return this.L();
    }

    public /* synthetic */ Message buildPartial() {
        return this.K();
    }

    public /* synthetic */ Message build() {
        return this.J();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.H();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.L();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.K();
    }

    public /* synthetic */ MessageLite build() {
        return this.J();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.H();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.I();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.I();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.L();
    }

    public /* synthetic */ Object clone() {
        return this.L();
    }
}

