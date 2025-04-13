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
 * Renamed from er
 */
public final class er_0
extends GeneratedMessageV3.Builder<er_0>
implements et_0 {
    private int a;
    private MapField<Integer, el_0> b;

    public static final Descriptors.Descriptor a() {
        return ef.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.m();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected MapField internalGetMutableMapField(int n) {
        switch (n) {
            case 2: {
                return this.n();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ef.b.ensureFieldAccessorsInitialized(ep_0.class, er_0.class);
    }

    er_0() {
        this.l();
    }

    er_0(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.l();
    }

    private void l() {
        if (ep_0.k()) {
            // empty if block
        }
    }

    public er_0 e() {
        super.clear();
        this.n().clear();
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ef.a;
    }

    public ep_0 f() {
        return ep_0.h();
    }

    public ep_0 g() {
        ep_0 ep_02 = this.h();
        if (!ep_02.isInitialized()) {
            throw er_0.newUninitializedMessageException((Message)ep_02);
        }
        return ep_02;
    }

    public ep_0 h() {
        ep_0 ep_02 = new ep_0(this);
        int n = this.a;
        ep_02.d = this.m();
        ep_02.d.makeImmutable();
        this.onBuilt();
        return ep_02;
    }

    public er_0 i() {
        return (er_0)super.clone();
    }

    public er_0 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (er_0)super.setField(fieldDescriptor, object);
    }

    public er_0 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (er_0)super.clearField(fieldDescriptor);
    }

    public er_0 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (er_0)super.clearOneof(oneofDescriptor);
    }

    public er_0 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (er_0)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public er_0 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (er_0)super.addRepeatedField(fieldDescriptor, object);
    }

    public er_0 a(Message message) {
        if (message instanceof ep_0) {
            return this.a((ep_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public er_0 a(ep_0 ep_02) {
        if (ep_02 == ep_0.h()) {
            return this;
        }
        this.n().mergeFrom(ep_02.l());
        this.b(ep_0.b(ep_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        for (el_0 el_02 : this.d().values()) {
            if (el_02.isInitialized()) continue;
            return false;
        }
        return true;
    }

    public er_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        ep_0 ep_02 = null;
        try {
            ep_02 = (ep_0)ep_0.b.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            ep_02 = (ep_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (ep_02 != null) {
                this.a(ep_02);
            }
        }
        return this;
    }

    private MapField<Integer, el_0> m() {
        if (this.b == null) {
            return MapField.emptyMapField(es_0.a);
        }
        return this.b;
    }

    private MapField<Integer, el_0> n() {
        this.onChanged();
        if (this.b == null) {
            this.b = MapField.newMapField(es_0.a);
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
    public Map<Integer, el_0> c() {
        return this.d();
    }

    @Override
    public Map<Integer, el_0> d() {
        return this.m().getMap();
    }

    @Override
    public el_0 a(int n, el_0 el_02) {
        Map map = this.m().getMap();
        return map.containsKey(n) ? (el_0)map.get(n) : el_02;
    }

    @Override
    public el_0 b(int n) {
        Map map = this.m().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (el_0)map.get(n);
    }

    public er_0 j() {
        this.n().getMutableMap().clear();
        return this;
    }

    public er_0 c(int n) {
        this.n().getMutableMap().remove(n);
        return this;
    }

    @Deprecated
    public Map<Integer, el_0> k() {
        return this.n().getMutableMap();
    }

    public er_0 b(int n, el_0 el_02) {
        if (el_02 == null) {
            throw new NullPointerException();
        }
        this.n().getMutableMap().put(n, el_02);
        return this;
    }

    public er_0 a(Map<Integer, el_0> map) {
        this.n().getMutableMap().putAll(map);
        return this;
    }

    public final er_0 a(UnknownFieldSet unknownFieldSet) {
        return (er_0)super.setUnknownFields(unknownFieldSet);
    }

    public final er_0 b(UnknownFieldSet unknownFieldSet) {
        return (er_0)super.mergeUnknownFields(unknownFieldSet);
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

