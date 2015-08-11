/*
 * Copyright 2015 Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.pcepio.protocol.ver1;

import org.onosproject.pcepio.protocol.PcInitiatedLspRequest;
import org.onosproject.pcepio.protocol.PcepAttribute;
import org.onosproject.pcepio.protocol.PcepBandwidthObject;
import org.onosproject.pcepio.protocol.PcepCloseMsg;
import org.onosproject.pcepio.protocol.PcepEndPointsObject;
import org.onosproject.pcepio.protocol.PcepEroObject;
import org.onosproject.pcepio.protocol.PcepFactory;
import org.onosproject.pcepio.protocol.PcepInitiateMsg;
import org.onosproject.pcepio.protocol.PcepKeepaliveMsg;
import org.onosproject.pcepio.protocol.PcepLspObject;
import org.onosproject.pcepio.protocol.PcepLspaObject;
import org.onosproject.pcepio.protocol.PcepMessage;
import org.onosproject.pcepio.protocol.PcepMessageReader;
import org.onosproject.pcepio.protocol.PcepMetricObject;
import org.onosproject.pcepio.protocol.PcepMsgPath;

import org.onosproject.pcepio.protocol.PcepSrpObject;
import org.onosproject.pcepio.protocol.PcepUpdateMsg;
import org.onosproject.pcepio.protocol.PcepUpdateRequest;
import org.onosproject.pcepio.protocol.PcepVersion;

public class PcepFactoryVer1 implements PcepFactory {

    public static final PcepFactoryVer1 INSTANCE = new PcepFactoryVer1();

    @Override
    public org.onosproject.pcepio.protocol.PcepOpenMsg.Builder buildOpenMsg() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepOpenObject.Builder buildOpenObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PcepKeepaliveMsg.Builder buildKeepaliveMsg() {
        return new PcepKeepaliveMsgVer1.Builder();
    }

    @Override
    public PcepCloseMsg.Builder buildCloseMsg() {
        return new PcepCloseMsgVer1.Builder();
    }

    @Override
    public PcepUpdateMsg.Builder buildUpdateMsg() {
        return new PcepUpdateMsgVer1.Builder();
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepReportMsg.Builder buildReportMsg() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PcepInitiateMsg.Builder buildPcepInitiateMsg() {
        return new PcepInitiateMsgVer1.Builder();
    }

    @Override
    public PcepLspObject.Builder buildLspObject() {
        return new PcepLspObjectVer1.Builder();
    }

    @Override
    public PcepMessageReader<PcepMessage> getReader() {
        return PcepMessageVer1.READER;
    }

    @Override
    public PcepVersion getVersion() {
        return PcepVersion.PCEP_1;
    }

    @Override
    public PcepSrpObject.Builder buildSrpObject() {
        return new PcepSrpObjectVer1.Builder();
    }

    @Override
    public PcepEndPointsObject.Builder buildEndPointsObject() {
        return new PcepEndPointsObjectVer1.Builder();
    }

    @Override
    public PcepEroObject.Builder buildEroObject() {
        return new PcepEroObjectVer1.Builder();
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepRroObject.Builder buildRroObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PcepLspaObject.Builder buildLspaObject() {
        return new PcepLspaObjectVer1.Builder();
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepIroObject.Builder buildIroObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PcepMetricObject.Builder buildMetricObject() {
        return new PcepMetricObjectVer1.Builder();
    }

    @Override
    public PcepBandwidthObject.Builder buildBandwidthObject() {
        return new PcepBandwidthObjectVer1.Builder();
    }

    @Override
    public PcepMsgPath.Builder buildPcepMsgPath() {
        return new PcepMsgPathVer1.Builder();
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepStateReport.Builder buildPcepStateReport() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public PcepUpdateRequest.Builder buildPcepUpdateRequest() {
        return new PcepUpdateRequestVer1.Builder();
    }

    @Override
    public PcInitiatedLspRequest.Builder buildPcInitiatedLspRequest() {
        return new PcInitiatedLspRequestVer1.Builder();
    }

    @Override
    public PcepAttribute.Builder buildPcepAttribute() {
        return new PcepAttributeVer1.Builder();
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepLabelUpdateMsg.Builder buildPcepLabelUpdateMsg() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepLabelUpdate.Builder buildPcepLabelUpdateObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepLabelObject.Builder buildLabelObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepErrorMsg.Builder buildPcepErrorMsg() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepErrorObject.Builder buildPcepErrorObject() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepFecObjectIPv4Adjacency.Builder buildFecIpv4Adjacency() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepErrorInfo.Builder buildPcepErrorInfo() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public org.onosproject.pcepio.protocol.PcepError.Builder buildPcepError() {
        // TODO Auto-generated method stub
        return null;
    }

}
