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

/*
 * Renamed from kr
 */
public final class kr_0
extends GeneratedMessageV3.Builder<kr_0>
implements ks_0 {
    private int a;
    private Object b = "";
    private long c;
    private le_0 d = null;
    private SingleFieldBuilderV3<le_0, lg, lp> e;
    private int f;

    public static final Descriptors.Descriptor a() {
        return kg.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return kg.h.ensureFieldAccessorsInitialized(kp_0.class, kr_0.class);
    }

    kr_0() {
        this.v();
    }

    kr_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.v();
    }

    private void v() {
        if (kp_0.r()) {
            this.w();
        }
    }

    public kr_0 l() {
        super.clear();
        this.b = "";
        this.a &= 0xFFFFFFFE;
        this.c = 0L;
        this.a &= 0xFFFFFFFD;
        if (this.e == null) {
            this.d = null;
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFB;
        this.f = 0;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return kg.g;
    }

    public kp_0 m() {
        return kp_0.o();
    }

    public kp_0 n() {
        kp_0 kp_02 = this.o();
        if (!kp_02.isInitialized()) {
            throw kr_0.newUninitializedMessageException((Message)kp_02);
        }
        return kp_02;
    }

    public kp_0 o() {
        kp_0 kp_02 = new kp_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        kp_02.h = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        kp_02.i = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        kp_02.j = this.e == null ? this.d : (le_0)this.e.build();
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        kp_02.k = this.f;
        kp_02.g = n2;
        this.onBuilt();
        return kp_02;
    }

    public kr_0 p() {
        return (kr_0)super.clone();
    }

    public kr_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kr_0)super.setField(fieldDescriptor, object);
    }

    public kr_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (kr_0)super.clearField(fieldDescriptor);
    }

    public kr_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (kr_0)super.clearOneof(oneofDescriptor);
    }

    public kr_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (kr_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public kr_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (kr_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public kr_0 a(Message message) {
        if (message instanceof kp_0) {
            return this.a((kp_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public kr_0 a(kp_0 kp_02) {
        if (kp_02 == kp_0.o()) {
            return this;
        }
        if (kp_02.b()) {
            this.a |= 1;
            this.b = kp_02.h;
            this.onChanged();
        }
        if (kp_02.e()) {
            this.a(kp_02.f());
        }
        if (kp_02.g()) {
            this.b(kp_02.h());
        }
        if (kp_02.j()) {
            this.a(kp_02.k());
        }
        this.b(kp_0.b(kp_02));
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
        if (!this.g()) {
            return false;
        }
        if (!this.j()) {
            return false;
        }
        return this.h().isInitialized();
    }

    public kr_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kp_0 kp_02 = null;
        try {
            kp_02 = (kp_0)kp_0.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kp_02 = (kp_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kp_02 != null) {
                this.a(kp_02);
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

    public kr_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = string;
        this.onChanged();
        return this;
    }

    public kr_0 q() {
        this.a &= 0xFFFFFFFE;
        this.b = kp_0.o().c();
        this.onChanged();
        return this;
    }

    public kr_0 a(ByteString byteString) {
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

    public kr_0 a(long l) {
        this.a |= 2;
        this.c = l;
        this.onChanged();
        return this;
    }

    public kr_0 r() {
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
    public le_0 h() {
        if (this.e == null) {
            return this.d == null ? le_0.H() : this.d;
        }
        return (le_0)this.e.getMessage();
    }

    public kr_0 a(le_0 le_02) {
        if (this.e == null) {
            if (le_02 == null) {
                throw new NullPointerException();
            }
            this.d = le_02;
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)le_02);
        }
        this.a |= 4;
        return this;
    }

    public kr_0 a(lg lg2) {
        if (this.e == null) {
            this.d = lg2.G();
            this.onChanged();
        } else {
            this.e.setMessage((AbstractMessage)lg2.G());
        }
        this.a |= 4;
        return this;
    }

    public kr_0 b(le_0 le_02) {
        if (this.e == null) {
            this.d = (this.a & 4) == 4 && this.d != null && this.d != le_0.H() ? le_0.a(this.d).a(le_02).H() : le_02;
            this.onChanged();
        } else {
            this.e.mergeFrom((AbstractMessage)le_02);
        }
        this.a |= 4;
        return this;
    }

    public kr_0 s() {
        if (this.e == null) {
            this.d = null;
            this.onChanged();
        } else {
            this.e.clear();
        }
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public lg t() {
        this.a |= 4;
        this.onChanged();
        return (lg)this.w().getBuilder();
    }

    @Override
    public lp i() {
        if (this.e != null) {
            return (lp)this.e.getMessageOrBuilder();
        }
        return this.d == null ? le_0.H() : this.d;
    }

    private SingleFieldBuilderV3<le_0, lg, lp> w() {
        if (this.e == null) {
            this.e = new SingleFieldBuilderV3((AbstractMessage)this.h(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.d = null;
        }
        return this.e;
    }

    @Override
    public boolean j() {
        return (this.a & 8) == 8;
    }

    @Override
    public int k() {
        return this.f;
    }

    public kr_0 a(int n) {
        this.a |= 8;
        this.f = n;
        this.onChanged();
        return this;
    }

    public kr_0 u() {
        this.a &= 0xFFFFFFF7;
        this.f = 0;
        this.onChanged();
        return this;
    }

    public final kr_0 a(UnknownFieldSet unknownFieldSet) {
        return (kr_0)super.setUnknownFields(unknownFieldSet);
    }

    public final kr_0 b(UnknownFieldSet unknownFieldSet) {
        return (kr_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.l();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.p();
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
        return this.l();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.p();
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
        return this.p();
    }

    public /* synthetic */ Message buildPartial() {
        return this.o();
    }

    public /* synthetic */ Message build() {
        return this.n();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.o();
    }

    public /* synthetic */ MessageLite build() {
        return this.n();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.l();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.m();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.p();
    }

    public /* synthetic */ Object clone() {
        return this.p();
    }
}

