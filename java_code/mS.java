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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class mS
extends GeneratedMessageV3.Builder<mS>
implements mT {
    private int a;
    private long b;
    private int c;
    private long d;
    private Object e = "";
    private int f;
    private int g = -1;
    private long h;
    private int i;
    private int j;
    private long k;
    private int l;
    private List<Integer> m = Collections.emptyList();
    private boolean n;
    private int o;
    private int p;

    public static final Descriptors.Descriptor a() {
        return mo_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mo_0.d.ensureFieldAccessorsInitialized(mq_1.class, mS.class);
    }

    mS() {
        this.aa();
    }

    mS(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.aa();
    }

    private void aa() {
        if (mq_1.M()) {
            // empty if block
        }
    }

    public mS G() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = 0;
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        this.e = "";
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = -1;
        this.a &= 0xFFFFFFDF;
        this.h = 0L;
        this.a &= 0xFFFFFFBF;
        this.i = 0;
        this.a &= 0xFFFFFF7F;
        this.j = 0;
        this.a &= 0xFFFFFEFF;
        this.k = 0L;
        this.a &= 0xFFFFFDFF;
        this.l = 0;
        this.a &= 0xFFFFFBFF;
        this.m = Collections.emptyList();
        this.a &= 0xFFFFF7FF;
        this.n = false;
        this.a &= 0xFFFFEFFF;
        this.o = 0;
        this.a &= 0xFFFFDFFF;
        this.p = 0;
        this.a &= 0xFFFFBFFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mo_0.c;
    }

    public mq_1 H() {
        return mq_1.J();
    }

    public mq_1 I() {
        mq_1 mq_12 = this.J();
        if (!mq_12.isInitialized()) {
            throw mS.newUninitializedMessageException((Message)mq_12);
        }
        return mq_12;
    }

    public mq_1 J() {
        mq_1 mq_12 = new mq_1(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        mq_12.s = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        mq_12.t = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        mq_12.u = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        mq_12.v = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        mq_12.w = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        mq_12.x = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        mq_12.y = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        mq_12.z = this.i;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        mq_12.A = this.j;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        mq_12.B = this.k;
        if ((n & 0x400) == 1024) {
            n2 |= 0x400;
        }
        mq_12.C = this.l;
        if ((this.a & 0x800) == 2048) {
            this.m = Collections.unmodifiableList(this.m);
            this.a &= 0xFFFFF7FF;
        }
        mq_12.D = this.m;
        if ((n & 0x1000) == 4096) {
            n2 |= 0x800;
        }
        mq_12.E = this.n;
        if ((n & 0x2000) == 8192) {
            n2 |= 0x1000;
        }
        mq_12.F = this.o;
        if ((n & 0x4000) == 16384) {
            n2 |= 0x2000;
        }
        mq_12.G = this.p;
        mq_12.r = n2;
        this.onBuilt();
        return mq_12;
    }

    public mS K() {
        return (mS)super.clone();
    }

    public mS a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mS)super.setField(fieldDescriptor, object);
    }

    public mS a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (mS)super.clearField(fieldDescriptor);
    }

    public mS a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (mS)super.clearOneof(oneofDescriptor);
    }

    public mS a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (mS)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public mS b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (mS)super.addRepeatedField(fieldDescriptor, object);
    }

    public mS a(Message message) {
        if (message instanceof mq_1) {
            return this.a((mq_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public mS a(mq_1 mq_12) {
        if (mq_12 == mq_1.J()) {
            return this;
        }
        if (mq_12.b()) {
            this.a(mq_12.c());
        }
        if (mq_12.d()) {
            this.b(mq_12.e());
        }
        if (mq_12.f()) {
            this.b(mq_12.g());
        }
        if (mq_12.h()) {
            this.a |= 8;
            this.e = mq_12.v;
            this.onChanged();
        }
        if (mq_12.k()) {
            this.c(mq_12.l());
        }
        if (mq_12.m()) {
            this.d(mq_12.n());
        }
        if (mq_12.o()) {
            this.c(mq_12.p());
        }
        if (mq_12.q()) {
            this.e(mq_12.r());
        }
        if (mq_12.s()) {
            this.f(mq_12.t());
        }
        if (mq_12.u()) {
            this.d(mq_12.v());
        }
        if (mq_12.w()) {
            this.g(mq_12.x());
        }
        if (!mq_12.D.isEmpty()) {
            if (this.m.isEmpty()) {
                this.m = mq_12.D;
                this.a &= 0xFFFFF7FF;
            } else {
                this.ab();
                this.m.addAll(mq_12.D);
            }
            this.onChanged();
        }
        if (mq_12.A()) {
            this.a(mq_12.B());
        }
        if (mq_12.C()) {
            this.i(mq_12.D());
        }
        if (mq_12.E()) {
            this.j(mq_12.F());
        }
        this.b(mq_1.b(mq_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.d()) {
            return false;
        }
        if (!this.f()) {
            return false;
        }
        if (!this.h()) {
            return false;
        }
        if (!this.o()) {
            return false;
        }
        if (!this.q()) {
            return false;
        }
        return this.s();
    }

    public mS a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mq_1 mq_12 = null;
        try {
            mq_12 = (mq_1)mq_1.p.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mq_12 = (mq_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mq_12 != null) {
                this.a(mq_12);
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

    public mS a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public mS L() {
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
    public int e() {
        return this.c;
    }

    public mS b(int n) {
        this.a |= 2;
        this.c = n;
        this.onChanged();
        return this;
    }

    public mS M() {
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
    public long g() {
        return this.d;
    }

    public mS b(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public mS N() {
        this.a &= 0xFFFFFFFB;
        this.d = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 8) == 8;
    }

    @Override
    public String i() {
        Object object = this.e;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.e = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString j() {
        Object object = this.e;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.e = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public mS a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = string;
        this.onChanged();
        return this;
    }

    public mS O() {
        this.a &= 0xFFFFFFF7;
        this.e = mq_1.J().i();
        this.onChanged();
        return this;
    }

    public mS a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 8;
        this.e = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean k() {
        return (this.a & 0x10) == 16;
    }

    @Override
    public int l() {
        return this.f;
    }

    public mS c(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public mS P() {
        this.a &= 0xFFFFFFEF;
        this.f = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean m() {
        return (this.a & 0x20) == 32;
    }

    @Override
    public int n() {
        return this.g;
    }

    public mS d(int n) {
        this.a |= 0x20;
        this.g = n;
        this.onChanged();
        return this;
    }

    public mS Q() {
        this.a &= 0xFFFFFFDF;
        this.g = -1;
        this.onChanged();
        return this;
    }

    @Override
    public boolean o() {
        return (this.a & 0x40) == 64;
    }

    @Override
    public long p() {
        return this.h;
    }

    public mS c(long l) {
        this.a |= 0x40;
        this.h = l;
        this.onChanged();
        return this;
    }

    public mS R() {
        this.a &= 0xFFFFFFBF;
        this.h = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean q() {
        return (this.a & 0x80) == 128;
    }

    @Override
    public int r() {
        return this.i;
    }

    public mS e(int n) {
        this.a |= 0x80;
        this.i = n;
        this.onChanged();
        return this;
    }

    public mS S() {
        this.a &= 0xFFFFFF7F;
        this.i = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean s() {
        return (this.a & 0x100) == 256;
    }

    @Override
    public int t() {
        return this.j;
    }

    public mS f(int n) {
        this.a |= 0x100;
        this.j = n;
        this.onChanged();
        return this;
    }

    public mS T() {
        this.a &= 0xFFFFFEFF;
        this.j = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean u() {
        return (this.a & 0x200) == 512;
    }

    @Override
    public long v() {
        return this.k;
    }

    public mS d(long l) {
        this.a |= 0x200;
        this.k = l;
        this.onChanged();
        return this;
    }

    public mS U() {
        this.a &= 0xFFFFFDFF;
        this.k = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean w() {
        return (this.a & 0x400) == 1024;
    }

    @Override
    public int x() {
        return this.l;
    }

    public mS g(int n) {
        this.a |= 0x400;
        this.l = n;
        this.onChanged();
        return this;
    }

    public mS V() {
        this.a &= 0xFFFFFBFF;
        this.l = 0;
        this.onChanged();
        return this;
    }

    private void ab() {
        if ((this.a & 0x800) != 2048) {
            this.m = new ArrayList<Integer>(this.m);
            this.a |= 0x800;
        }
    }

    @Override
    public List<Integer> y() {
        return Collections.unmodifiableList(this.m);
    }

    @Override
    public int z() {
        return this.m.size();
    }

    @Override
    public int a(int n) {
        return this.m.get(n);
    }

    public mS a(int n, int n2) {
        this.ab();
        this.m.set(n, n2);
        this.onChanged();
        return this;
    }

    public mS h(int n) {
        this.ab();
        this.m.add(n);
        this.onChanged();
        return this;
    }

    public mS a(Iterable<? extends Integer> iterable) {
        this.ab();
        AbstractMessageLite.Builder.addAll(iterable, this.m);
        this.onChanged();
        return this;
    }

    public mS W() {
        this.m = Collections.emptyList();
        this.a &= 0xFFFFF7FF;
        this.onChanged();
        return this;
    }

    @Override
    public boolean A() {
        return (this.a & 0x1000) == 4096;
    }

    @Override
    public boolean B() {
        return this.n;
    }

    public mS a(boolean bl) {
        this.a |= 0x1000;
        this.n = bl;
        this.onChanged();
        return this;
    }

    public mS X() {
        this.a &= 0xFFFFEFFF;
        this.n = false;
        this.onChanged();
        return this;
    }

    @Override
    public boolean C() {
        return (this.a & 0x2000) == 8192;
    }

    @Override
    public int D() {
        return this.o;
    }

    public mS i(int n) {
        this.a |= 0x2000;
        this.o = n;
        this.onChanged();
        return this;
    }

    public mS Y() {
        this.a &= 0xFFFFDFFF;
        this.o = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean E() {
        return (this.a & 0x4000) == 16384;
    }

    @Override
    public int F() {
        return this.p;
    }

    public mS j(int n) {
        this.a |= 0x4000;
        this.p = n;
        this.onChanged();
        return this;
    }

    public mS Z() {
        this.a &= 0xFFFFBFFF;
        this.p = 0;
        this.onChanged();
        return this;
    }

    public final mS a(UnknownFieldSet unknownFieldSet) {
        return (mS)super.setUnknownFields(unknownFieldSet);
    }

    public final mS b(UnknownFieldSet unknownFieldSet) {
        return (mS)super.mergeUnknownFields(unknownFieldSet);
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
        return this.G();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.K();
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
        return this.G();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.K();
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
        return this.K();
    }

    public /* synthetic */ Message buildPartial() {
        return this.J();
    }

    public /* synthetic */ Message build() {
        return this.I();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.G();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.K();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.J();
    }

    public /* synthetic */ MessageLite build() {
        return this.I();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.G();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.H();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.H();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.K();
    }

    public /* synthetic */ Object clone() {
        return this.K();
    }
}

