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
 * Renamed from ke
 */
public final class ke_0
extends GeneratedMessageV3.Builder<ke_0>
implements kf_0 {
    private int a;
    private long b;
    private Object c = "";
    private long d;
    private int e;

    public static final Descriptors.Descriptor a() {
        return jo_0.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return jo_0.d.ensureFieldAccessorsInitialized(kc_0.class, ke_0.class);
    }

    ke_0() {
        this.t();
    }

    ke_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.t();
    }

    private void t() {
        if (kc_0.q()) {
            // empty if block
        }
    }

    public ke_0 k() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = 0L;
        this.a &= 0xFFFFFFFB;
        this.e = 0;
        this.a &= 0xFFFFFFF7;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return jo_0.c;
    }

    public kc_0 l() {
        return kc_0.n();
    }

    public kc_0 m() {
        kc_0 kc_02 = this.n();
        if (!kc_02.isInitialized()) {
            throw ke_0.newUninitializedMessageException((Message)kc_02);
        }
        return kc_02;
    }

    public kc_0 n() {
        kc_0 kc_02 = new kc_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        kc_02.h = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        kc_02.i = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        kc_02.j = this.d;
        if ((n & 8) == 8) {
            n2 |= 8;
        }
        kc_02.k = this.e;
        kc_02.g = n2;
        this.onBuilt();
        return kc_02;
    }

    public ke_0 o() {
        return (ke_0)super.clone();
    }

    public ke_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ke_0)super.setField(fieldDescriptor, object);
    }

    public ke_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (ke_0)super.clearField(fieldDescriptor);
    }

    public ke_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (ke_0)super.clearOneof(oneofDescriptor);
    }

    public ke_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (ke_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public ke_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (ke_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public ke_0 a(Message message) {
        if (message instanceof kc_0) {
            return this.a((kc_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public ke_0 a(kc_0 kc_02) {
        if (kc_02 == kc_0.n()) {
            return this;
        }
        if (kc_02.b()) {
            this.a(kc_02.c());
        }
        if (kc_02.d()) {
            this.a |= 2;
            this.c = kc_02.i;
            this.onChanged();
        }
        if (kc_02.g()) {
            this.b(kc_02.h());
        }
        if (kc_02.i()) {
            this.a(kc_02.j());
        }
        this.b(kc_0.b(kc_02));
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
        return this.i();
    }

    public ke_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        kc_0 kc_02 = null;
        try {
            kc_02 = (kc_0)kc_0.e.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            kc_02 = (kc_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (kc_02 != null) {
                this.a(kc_02);
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

    public ke_0 a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public ke_0 p() {
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

    public ke_0 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public ke_0 q() {
        this.a &= 0xFFFFFFFD;
        this.c = kc_0.n().e();
        this.onChanged();
        return this;
    }

    public ke_0 a(ByteString byteString) {
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
    public long h() {
        return this.d;
    }

    public ke_0 b(long l) {
        this.a |= 4;
        this.d = l;
        this.onChanged();
        return this;
    }

    public ke_0 r() {
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
    public int j() {
        return this.e;
    }

    public ke_0 a(int n) {
        this.a |= 8;
        this.e = n;
        this.onChanged();
        return this;
    }

    public ke_0 s() {
        this.a &= 0xFFFFFFF7;
        this.e = 0;
        this.onChanged();
        return this;
    }

    public final ke_0 a(UnknownFieldSet unknownFieldSet) {
        return (ke_0)super.setUnknownFields(unknownFieldSet);
    }

    public final ke_0 b(UnknownFieldSet unknownFieldSet) {
        return (ke_0)super.mergeUnknownFields(unknownFieldSet);
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
        return this.k();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.o();
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
        return this.k();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.o();
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
        return this.o();
    }

    public /* synthetic */ Message buildPartial() {
        return this.n();
    }

    public /* synthetic */ Message build() {
        return this.m();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.n();
    }

    public /* synthetic */ MessageLite build() {
        return this.m();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.k();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.o();
    }

    public /* synthetic */ Object clone() {
        return this.o();
    }
}

