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
 * Renamed from lI
 */
public final class li_0
extends GeneratedMessageV3.Builder<li_0>
implements lJ {
    private int a;
    private int b;
    private Object c = "";
    private int d;
    private int e;
    private int f;
    private int g;
    private long h;
    private long i;
    private int j;
    private long k;

    public static final Descriptors.Descriptor a() {
        return kM.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kM.d.ensureFieldAccessorsInitialized(lg_0.class, li_0.class);
    }

    li_0() {
        this.L();
    }

    li_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.L();
    }

    private void L() {
        if (lg_0.C()) {
            // empty if block
        }
    }

    public li_0 w() {
        super.clear();
        this.b = 0;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.a &= 0xFFFFFFEF;
        this.g = 0;
        this.a &= 0xFFFFFFDF;
        this.h = 0L;
        this.a &= 0xFFFFFFBF;
        this.i = 0L;
        this.a &= 0xFFFFFF7F;
        this.j = 0;
        this.a &= 0xFFFFFEFF;
        this.k = 0L;
        this.a &= 0xFFFFFDFF;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kM.c;
    }

    public lg_0 x() {
        return lg_0.z();
    }

    public lg_0 y() {
        lg_0 lg_02 = this.z();
        if (!lg_02.isInitialized()) {
            throw li_0.newUninitializedMessageException((Message)lg_02);
        }
        return lg_02;
    }

    public lg_0 z() {
        lg_0 lg_02 = new lg_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        lg_02.n = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        lg_02.o = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        lg_02.p = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        lg_02.q = this.e;
        if ((n & 0x10) == 16) {
            n2 |= 0x10;
        }
        lg_02.r = this.f;
        if ((n & 0x20) == 32) {
            n2 |= 0x20;
        }
        lg_02.s = this.g;
        if ((n & 0x40) == 64) {
            n2 |= 0x40;
        }
        lg_02.t = this.h;
        if ((n & 0x80) == 128) {
            n2 |= 0x80;
        }
        lg_02.u = this.i;
        if ((n & 0x100) == 256) {
            n2 |= 0x100;
        }
        lg_02.v = this.j;
        if ((n & 0x200) == 512) {
            n2 |= 0x200;
        }
        lg_02.w = this.k;
        lg_02.m = n2;
        this.onBuilt();
        return lg_02;
    }

    public li_0 A() {
        return (li_0)super.clone();
    }

    public li_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (li_0)super.setField(fieldDescriptor, object);
    }

    public li_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (li_0)super.clearField(fieldDescriptor);
    }

    public li_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (li_0)super.clearOneof(oneofDescriptor);
    }

    public li_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (li_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public li_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (li_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public li_0 a(Message message) {
        if (message instanceof lg_0) {
            return this.a((lg_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public li_0 a(lg_0 lg_02) {
        if (lg_02 == lg_0.z()) {
            return this;
        }
        if (lg_02.b()) {
            this.a(lg_02.c());
        }
        if (lg_02.d()) {
            this.a |= 2;
            this.c = lg_02.o;
            this.onChanged();
        }
        if (lg_02.g()) {
            this.b(lg_02.h());
        }
        if (lg_02.i()) {
            this.c(lg_02.j());
        }
        if (lg_02.k()) {
            this.d(lg_02.l());
        }
        if (lg_02.m()) {
            this.e(lg_02.n());
        }
        if (lg_02.o()) {
            this.a(lg_02.p());
        }
        if (lg_02.q()) {
            this.b(lg_02.r());
        }
        if (lg_02.s()) {
            this.f(lg_02.t());
        }
        if (lg_02.u()) {
            this.c(lg_02.v());
        }
        this.b(lg_0.b(lg_02));
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
        if (!this.g()) {
            return false;
        }
        if (!this.i()) {
            return false;
        }
        if (!this.k()) {
            return false;
        }
        if (!this.m()) {
            return false;
        }
        if (!this.o()) {
            return false;
        }
        if (!this.q()) {
            return false;
        }
        if (!this.s()) {
            return false;
        }
        return this.u();
    }

    public li_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        lg_0 lg_02 = null;
        try {
            lg_02 = (lg_0)lg_0.k.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            lg_02 = (lg_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (lg_02 != null) {
                this.a(lg_02);
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

    public li_0 a(int n) {
        this.a |= 1;
        this.b = n;
        this.onChanged();
        return this;
    }

    public li_0 B() {
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
    public String e() {
        Object object = this.c;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.c = string;
            }
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString f() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public li_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public li_0 C() {
        this.a &= 0xFFFFFFFD;
        this.c = lg_0.z().e();
        this.onChanged();
        return this;
    }

    public li_0 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean g() {
        return (this.a & 4) == 4;
    }

    @Override
    public int h() {
        return this.d;
    }

    public li_0 b(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public li_0 D() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    @Override
    public boolean i() {
        return (this.a & 8) == 8;
    }

    @Override
    public int j() {
        return this.e;
    }

    public li_0 c(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public li_0 E() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
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

    public li_0 d(int n) {
        this.a |= 0x10;
        this.f = n;
        this.onChanged();
        return this;
    }

    public li_0 F() {
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

    public li_0 e(int n) {
        this.a |= 0x20;
        this.g = n;
        this.onChanged();
        return this;
    }

    public li_0 G() {
        this.a &= 0xFFFFFFDF;
        this.g = 0;
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

    public li_0 a(long l) {
        this.a |= 0x40;
        this.h = l;
        this.onChanged();
        return this;
    }

    public li_0 H() {
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
    public long r() {
        return this.i;
    }

    public li_0 b(long l) {
        this.a |= 0x80;
        this.i = l;
        this.onChanged();
        return this;
    }

    public li_0 I() {
        this.a &= 0xFFFFFF7F;
        this.i = 0L;
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

    public li_0 f(int n) {
        this.a |= 0x100;
        this.j = n;
        this.onChanged();
        return this;
    }

    public li_0 J() {
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

    public li_0 c(long l) {
        this.a |= 0x200;
        this.k = l;
        this.onChanged();
        return this;
    }

    public li_0 K() {
        this.a &= 0xFFFFFDFF;
        this.k = 0L;
        this.onChanged();
        return this;
    }

    public final li_0 a(UnknownFieldSet unknownFieldSet) {
        return (li_0)super.setUnknownFields(unknownFieldSet);
    }

    public final li_0 b(UnknownFieldSet unknownFieldSet) {
        return (li_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.w();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.A();
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
        return this.w();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.A();
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
        return this.A();
    }

    public /* synthetic */ Message buildPartial() {
        return this.z();
    }

    public /* synthetic */ Message build() {
        return this.y();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.w();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.A();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.z();
    }

    public /* synthetic */ MessageLite build() {
        return this.y();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.w();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.x();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.x();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.A();
    }

    public /* synthetic */ Object clone() {
        return this.A();
    }
}

