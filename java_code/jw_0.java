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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;

/*
 * Renamed from jW
 */
public final class jw_0
extends GeneratedMessageV3.Builder<jw_0>
implements jx_0 {
    private int a;
    private long b;
    private long c;
    private int d;
    private long e;
    private long f;
    private boolean g;
    private ByteString h = ByteString.EMPTY;
    private ByteString i = ByteString.EMPTY;
    private int j;
    private int k;
    private Object l = "";
    private long m;
    private ByteString n = ByteString.EMPTY;
    private ByteString o = ByteString.EMPTY;

    public static final Descriptors.Descriptor a() {
        return jo_0.e;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jo_0.f.ensureFieldAccessorsInitialized(ju_0.class, jw_0.class);
    }

    jw_0() {
        this.X();
    }

    jw_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.X();
    }

    private void X() {
        if (ju_0.K()) {
            // empty if block
        }
    }

    public jw_0 E() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0L;
        this.a &= 0xFFFFFFF7;
        this.f = 0L;
        this.a &= 0xFFFFFFEF;
        this.g = false;
        this.a &= 0xFFFFFFDF;
        this.h = ByteString.EMPTY;
        this.a &= 0xFFFFFFBF;
        this.i = ByteString.EMPTY;
        this.a &= 0xFFFFFF7F;
        this.j = 0;
        this.a &= 0xFFFFFEFF;
        this.k = 0;
        this.a &= 0xFFFFFDFF;
        this.l = "";
        this.a &= 0xFFFFFBFF;
        this.m = 0L;
        this.a &= 0xFFFFF7FF;
        this.n = ByteString.EMPTY;
        this.a &= 0xFFFFEFFF;
        this.o = ByteString.EMPTY;
        this.a &= 0xFFFFDFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jo_0.e;
    }

    public ju_0 F() {
        return ju_0.H();
    }

    public ju_0 G() {
        ju_0 ju_02 = this.H();
        if (!ju_02.isInitialized()) {
            throw jw_0.newUninitializedMessageException((Message)ju_02);
        }
        return ju_02;
    }

    public ju_0 H() {
        ju_0 ju_02 = new ju_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        ju_02.r = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        ju_02.s = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        ju_02.t = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        ju_02.u = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        ju_02.v = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        ju_02.w = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        ju_02.x = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        ju_02.y = this.i;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        ju_02.z = this.j;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        ju_02.A = this.k;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        ju_02.B = this.l;
        if ((n & 0x800) == 2048) {
            n2 |= 0x800;
        }
        ju_02.C = this.m;
        if ((n & 0x1000) == 4096) {
            n2 |= 0x1000;
        }
        ju_02.D = this.n;
        if ((n & 0x2000) == 8192) {
            n2 |= 0x2000;
        }
        ju_02.E = this.o;
        ju_02.q = n2;
        this.onBuilt();
        return ju_02;
    }

    public jw_0 I() {
        return (jw_0)super.clone();
    }

    public jw_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jw_0)super.setField(fieldDescriptor, object);
    }

    public jw_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (jw_0)super.clearField(fieldDescriptor);
    }

    public jw_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (jw_0)super.clearOneof(oneofDescriptor);
    }

    public jw_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (jw_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public jw_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (jw_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public jw_0 a(Message message) {
        if (message instanceof ju_0) {
            return this.a((ju_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public jw_0 a(ju_0 ju_02) {
        if (ju_02 == ju_0.H()) {
            return this;
        }
        if (ju_02.b()) {
            this.a(ju_02.c());
        }
        if (ju_02.d()) {
            this.b(ju_02.e());
        }
        if (ju_02.f()) {
            this.a(ju_02.g());
        }
        if (ju_02.h()) {
            this.c(ju_02.i());
        }
        if (ju_02.j()) {
            this.d(ju_02.k());
        }
        if (ju_02.l()) {
            this.a(ju_02.m());
        }
        if (ju_02.n()) {
            this.a(ju_02.o());
        }
        if (ju_02.p()) {
            this.b(ju_02.q());
        }
        if (ju_02.r()) {
            this.b(ju_02.s());
        }
        if (ju_02.t()) {
            this.c(ju_02.u());
        }
        if (ju_02.v()) {
            this.a |= 0x400;
            this.l = ju_02.B;
            this.onChanged();
        }
        if (ju_02.y()) {
            this.e(ju_02.z());
        }
        if (ju_02.A()) {
            this.d(ju_02.B());
        }
        if (ju_02.C()) {
            this.e(ju_02.D());
        }
        this.b(ju_0.b(ju_02));
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
        if (!this.y()) {
            return false;
        }
        if (!this.A()) {
            return false;
        }
        return this.C();
    }

    public jw_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ju_0 ju_02 = null;
        try {
            ju_02 = (ju_0)ju_0.o.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ju_02 = (ju_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ju_02 != null) {
                this.a(ju_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public jw_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public jw_0 J() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public long e() {
        return this.c;
    }

    public jw_0 b(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public jw_0 K() {
        this.a &= 0xFFFFFFFD;
        this.c = 0L;
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

    public jw_0 a(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public jw_0 L() {
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
    public long i() {
        return this.e;
    }

    public jw_0 c(long l) {
        this.a |= 8;
        this.e = l;
        this.onChanged();
        return this;
    }

    public jw_0 M() {
        this.a &= 0xFFFFFFF7;
        this.e = 0L;
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

    public jw_0 d(long l) {
        this.a |= 0x10;
        this.f = l;
        this.onChanged();
        return this;
    }

    public jw_0 N() {
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
    public boolean m() {
        return this.g;
    }

    public jw_0 a(boolean bl) {
        this.a |= 0x20;
        this.g = bl;
        this.onChanged();
        return this;
    }

    public jw_0 O() {
        this.a &= 0xFFFFFFDF;
        this.g = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean n() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public ByteString o() {
        return this.h;
    }

    public jw_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x40;
        this.h = byteString;
        this.onChanged();
        return this;
    }

    public jw_0 P() {
        this.a &= 0xFFFFFFBF;
        this.h = ju_0.H().o();
        this.onChanged();
        return this;
    }

    @Override
    public boolean p() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public ByteString q() {
        return this.i;
    }

    public jw_0 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x80;
        this.i = byteString;
        this.onChanged();
        return this;
    }

    public jw_0 Q() {
        this.a &= 0xFFFFFF7F;
        this.i = ju_0.H().q();
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

    public jw_0 b(int n) {
        this.a |= 0x100;
        this.j = n;
        this.onChanged();
        return this;
    }

    public jw_0 R() {
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

    public jw_0 c(int n) {
        this.a |= 0x200;
        this.k = n;
        this.onChanged();
        return this;
    }

    public jw_0 S() {
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
    public String w() {
        Object object = this.l;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.l = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString x() {
        Object object = this.l;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.l = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public jw_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 0x400;
        this.l = string;
        this.onChanged();
        return this;
    }

    public jw_0 T() {
        this.a &= 0xFFFFFBFF;
        this.l = ju_0.H().w();
        this.onChanged();
        return this;
    }

    public jw_0 c(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x400;
        this.l = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean y() {
        return (this.a & 0x800) == 2048;
    }

    @Override
    public long z() {
        return this.m;
    }

    public jw_0 e(long l) {
        this.a |= 0x800;
        this.m = l;
        this.onChanged();
        return this;
    }

    public jw_0 U() {
        this.a &= 0xFFFFF7FF;
        this.m = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean A() {
        return (this.a & 0x1000) == 4096;
    }

    @Override
    public ByteString B() {
        return this.n;
    }

    public jw_0 d(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x1000;
        this.n = byteString;
        this.onChanged();
        return this;
    }

    public jw_0 V() {
        this.a &= 0xFFFFEFFF;
        this.n = ju_0.H().B();
        this.onChanged();
        return this;
    }

    @Override
    public boolean C() {
        return (this.a & 0x2000) == 8192;
    }

    @Override
    public ByteString D() {
        return this.o;
    }

    public jw_0 e(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 0x2000;
        this.o = byteString;
        this.onChanged();
        return this;
    }

    public jw_0 W() {
        this.a &= 0xFFFFDFFF;
        this.o = ju_0.H().D();
        this.onChanged();
        return this;
    }

    public final jw_0 a(UnknownFieldSet unknownFieldSet) {
        return (jw_0)super.setUnknownFields(unknownFieldSet);
    }

    public final jw_0 b(UnknownFieldSet unknownFieldSet) {
        return (jw_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.E();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.I();
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
        return this.E();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.I();
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
        return this.I();
    }

    public /* synthetic */ Message buildPartial() {
        return this.H();
    }

    public /* synthetic */ Message build() {
        return this.G();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.E();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.I();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.H();
    }

    public /* synthetic */ MessageLite build() {
        return this.G();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.E();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.F();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.F();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.I();
    }

    public /* synthetic */ Object clone() {
        return this.I();
    }
}

