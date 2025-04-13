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
 * Renamed from Nb
 */
public final class nb_1
extends GeneratedMessageV3.Builder<nb_1>
implements nc_1 {
    private int a;
    private Object b = "";
    private Object c = "";
    private int d;

    public static final Descriptors.Descriptor a() {
        return mt_2.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return mt_2.d.ensureFieldAccessorsInitialized(mz_2.class, nb_1.class);
    }

    nb_1() {
        this.r();
    }

    nb_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.r();
    }

    private void r() {
        if (mz_2.p()) {
            // empty if block
        }
    }

    public nb_1 j() {
        super.clear();
        this.b = "";
        this.a &= 0xFFFFFFFE;
        this.c = "";
        this.a &= 0xFFFFFFFD;
        this.d = 0;
        this.a &= 0xFFFFFFFB;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return mt_2.c;
    }

    public mz_2 k() {
        return mz_2.m();
    }

    public mz_2 l() {
        mz_2 mz_22 = this.m();
        if (!mz_22.isInitialized()) {
            throw nb_1.newUninitializedMessageException((Message)mz_22);
        }
        return mz_22;
    }

    public mz_2 m() {
        mz_2 mz_22 = new mz_2(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        mz_22.g = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        mz_22.h = this.c;
        if ((n & 4) == 4) {
            n2 |= 4;
        }
        mz_22.i = this.d;
        mz_22.f = n2;
        this.onBuilt();
        return mz_22;
    }

    public nb_1 n() {
        return (nb_1)super.clone();
    }

    public nb_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nb_1)super.setField(fieldDescriptor, object);
    }

    public nb_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (nb_1)super.clearField(fieldDescriptor);
    }

    public nb_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (nb_1)super.clearOneof(oneofDescriptor);
    }

    public nb_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (nb_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public nb_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (nb_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public nb_1 a(Message message) {
        if (message instanceof mz_2) {
            return this.a((mz_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public nb_1 a(mz_2 mz_22) {
        if (mz_22 == mz_2.m()) {
            return this;
        }
        if (mz_22.b()) {
            this.a |= 1;
            this.b = mz_22.g;
            this.onChanged();
        }
        if (mz_22.e()) {
            this.a |= 2;
            this.c = mz_22.h;
            this.onChanged();
        }
        if (mz_22.h()) {
            this.a(mz_22.i());
        }
        this.b(mz_2.b(mz_22));
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
        return this.h();
    }

    public nb_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        mz_2 mz_22 = null;
        try {
            mz_22 = (mz_2)mz_2.d.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            mz_22 = (mz_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (mz_22 != null) {
                this.a(mz_22);
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

    public nb_1 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 1;
        this.b = string;
        this.onChanged();
        return this;
    }

    public nb_1 o() {
        this.a &= 0xFFFFFFFE;
        this.b = mz_2.m().c();
        this.onChanged();
        return this;
    }

    public nb_1 a(ByteString byteString) {
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
    public String f() {
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
    public ByteString g() {
        Object object = this.c;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.c = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public nb_1 b(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = string;
        this.onChanged();
        return this;
    }

    public nb_1 p() {
        this.a &= 0xFFFFFFFD;
        this.c = mz_2.m().f();
        this.onChanged();
        return this;
    }

    public nb_1 b(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        this.a |= 2;
        this.c = byteString;
        this.onChanged();
        return this;
    }

    @Override
    public boolean h() {
        return (this.a & 4) == 4;
    }

    @Override
    public int i() {
        return this.d;
    }

    public nb_1 a(int n) {
        this.a |= 4;
        this.d = n;
        this.onChanged();
        return this;
    }

    public nb_1 q() {
        this.a &= 0xFFFFFFFB;
        this.d = 0;
        this.onChanged();
        return this;
    }

    public final nb_1 a(UnknownFieldSet unknownFieldSet) {
        return (nb_1)super.setUnknownFields(unknownFieldSet);
    }

    public final nb_1 b(UnknownFieldSet unknownFieldSet) {
        return (nb_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.j();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.n();
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
        return this.j();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.n();
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
        return this.n();
    }

    public /* synthetic */ Message buildPartial() {
        return this.m();
    }

    public /* synthetic */ Message build() {
        return this.l();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.m();
    }

    public /* synthetic */ MessageLite build() {
        return this.l();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.j();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.n();
    }

    public /* synthetic */ Object clone() {
        return this.n();
    }
}

