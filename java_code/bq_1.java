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
 * Renamed from bq
 */
public final class bq_1
extends GeneratedMessageV3.Builder<bq_1>
implements br_1 {
    private Object a = "";

    public static final Descriptors.Descriptor a() {
        return ak_2.aa;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.ab.ensureFieldAccessorsInitialized(bo_1.class, bq_1.class);
    }

    bq_1() {
        this.j();
    }

    bq_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.j();
    }

    private void j() {
        if (bo_1.j()) {
            // empty if block
        }
    }

    public bq_1 d() {
        super.clear();
        this.a = "";
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.aa;
    }

    public bo_1 e() {
        return bo_1.g();
    }

    public bo_1 f() {
        bo_1 bo_12 = this.g();
        if (!bo_12.isInitialized()) {
            throw bq_1.newUninitializedMessageException((Message)bo_12);
        }
        return bo_12;
    }

    public bo_1 g() {
        bo_1 bo_12 = new bo_1(this);
        bo_12.c = this.a;
        this.onBuilt();
        return bo_12;
    }

    public bq_1 h() {
        return (bq_1)super.clone();
    }

    public bq_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bq_1)super.setField(fieldDescriptor, object);
    }

    public bq_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bq_1)super.clearField(fieldDescriptor);
    }

    public bq_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bq_1)super.clearOneof(oneofDescriptor);
    }

    public bq_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bq_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bq_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bq_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public bq_1 a(Message message) {
        if (message instanceof bo_1) {
            return this.a((bo_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bq_1 a(bo_1 bo_12) {
        if (bo_12 == bo_1.g()) {
            return this;
        }
        if (!bo_12.b().isEmpty()) {
            this.a = bo_12.c;
            this.onChanged();
        }
        this.b(bo_1.b(bo_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bq_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bo_1 bo_12 = null;
        try {
            bo_12 = (bo_1)bo_1.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bo_12 = (bo_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bo_12 != null) {
                this.a(bo_12);
            }
        }
        return this;
    }

    @Override
    public String b() {
        Object object = this.a;
        if (!(object instanceof String)) {
            ByteString byteString = (ByteString)object;
            String string = byteString.toStringUtf8();
            this.a = string;
            return string;
        }
        return (String)object;
    }

    @Override
    public ByteString c() {
        Object object = this.a;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.a = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public bq_1 a(String string) {
        if (string == null) {
            throw new NullPointerException();
        }
        this.a = string;
        this.onChanged();
        return this;
    }

    public bq_1 i() {
        this.a = bo_1.g().b();
        this.onChanged();
        return this;
    }

    public bq_1 a(ByteString byteString) {
        if (byteString == null) {
            throw new NullPointerException();
        }
        bo_1.b(byteString);
        this.a = byteString;
        this.onChanged();
        return this;
    }

    public final bq_1 a(UnknownFieldSet unknownFieldSet) {
        return (bq_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bq_1 b(UnknownFieldSet unknownFieldSet) {
        return (bq_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.d();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.h();
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
        return this.d();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.h();
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
        return this.h();
    }

    public /* synthetic */ Message buildPartial() {
        return this.g();
    }

    public /* synthetic */ Message build() {
        return this.f();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.d();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.h();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.g();
    }

    public /* synthetic */ MessageLite build() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.d();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.e();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.e();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.h();
    }

    public /* synthetic */ Object clone() {
        return this.h();
    }
}

