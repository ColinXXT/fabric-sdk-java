/*
 Copyright IBM Corp. All Rights Reserved.

 SPDX-License-Identifier: Apache-2.0
*/
package org.hyperledger.fabric.sdkintegration;

import org.hyperledger.fabric_ca.sdkintegration.HFCAClientIT;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith (Suite.class)

@Suite.SuiteClasses (
        {
                End2endIT.class,
                End2endAndBackAgainIT.class,
                UpdateChannelIT.class,
                NetworkConfigIT.class,
                End2endNodeIT.class,
                End2endJavaIT.class,
                End2endAndBackAgainNodeIT.class,
                End2endIdemixIT.class,
                PrivateDataIT.class,
                ServiceDiscoveryIT.class,
                HFCAClientIT.class
        })
public class IntegrationSuite {

}
