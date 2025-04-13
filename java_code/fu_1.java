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
 *  com.google.protobuf.MapField
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
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.UnknownFieldSet;
import java.util.Map;

/*
 * Renamed from fU
 */
public final class fu_1
extends GeneratedMessageV3.Builder<fu_1>
implements fw_2 {
    private int a;
    private MapField<Integer, fo_2> b;

    public static final Descriptors.Descriptor a() {
        return fr_1.q;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.m();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 1: {
                return this.n();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return fr_1.r.ensureFieldAccessorsInitialized(fs_2.class, fu_1.class);
    }

    fu_1() {
        this.l();
    }

    fu_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (fs_2.k()) {
            // empty if block
        }
    }

    public fu_1 e() {
        super.clear();
        this.n().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return fr_1.q;
    }

    public fs_2 f() {
        return fs_2.h();
    }

    public fs_2 g() {
        fs_2 fs_22 = this.h();
        if (!fs_22.isInitialized()) {
            throw fu_1.newUninitializedMessageException((Message)fs_22);
        }
        return fs_22;
    }

    public fs_2 h() {
        fs_2 fs_22 = new fs_2(this);
        int n = this.a;
        fs_22.d = this.m();
        fs_22.d.makeImmutable();
        this.onBuilt();
        return fs_22;
    }

    public fu_1 i() {
        return (fu_1)super.clone();
    }

    public fu_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fu_1)super.setField(fieldDescriptor, object);
    }

    public fu_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (fu_1)super.clearField(fieldDescriptor);
    }

    public fu_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (fu_1)super.clearOneof(oneofDescriptor);
    }

    public fu_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (fu_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public fu_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (fu_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public fu_1 a(Message message) {
        if (message instanceof fs_2) {
            return this.a((fs_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public fu_1 a(fs_2 fs_22) {
        if (fs_22 == fs_2.h()) {
            return this;
        }
        this.n().mergeFrom(fs_22.l());
        this.b(fs_2.b(fs_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public fu_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        fs_2 fs_22 = null;
        try {
            fs_22 = (fs_2)fs_2.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            fs_22 = (fs_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (fs_22 != null) {
                this.a(fs_22);
            }
        }
        return this;
    }

    private MapField<Integer, fo_2> m() {
        if (this.b == null) {
            return MapField.emptyMapField(fv_1.a);
        }
        return this.b;
    }

    private MapField<Integer, fo_2> n() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(fv_1.a);
        }
        if (!this.b.isMutable()) {
            this.b = this.b.copy();
        }
        return this.b;
    }

    @Override
    public int b() {
        return this.m().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.m().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, fo_2> c() {
        return this.d();
    }

    @Override
    public Map<Integer, fo_2> d() {
        return this.m().getMap();
    }

    @Override
    public fo_2 a(int n, fo_2 fo_22) {
        Map map = this.m().getMap();
        return map.containsKey(n) ? (fo_2)map.get(n) : fo_22;
    }

    @Override
    public fo_2 b(int n) {
        Map map = this.m().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (fo_2)map.get(n);
    }

    public fu_1 j() {
        this.n().getMutableMap().clear();
        return this;
    }

    public fu_1 c(int n) {
        this.n().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, fo_2> k() {
        return this.n().getMutableMap();
    }

    public fu_1 b(int n, fo_2 fo_22) {
        if (fo_22 == null) {
            throw new NullPointerException();
        }
        this.n().getMutableMap().put(n, fo_22);
        return this;
    }

    public fu_1 a(Map<Integer, fo_2> map) {
        this.n().getMutableMap().putAll(map);
        return this;
    }

    public final fu_1 a(UnknownFieldSet unknownFieldSet) {
        return (fu_1)super.setUnknownFields(unknownFieldSet);
    }

    public final fu_1 b(UnknownFieldSet unknownFieldSet) {
        return (fu_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

