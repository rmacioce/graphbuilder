//////////////////////////////////////////////////////////////////////////////
// INTEL CONFIDENTIAL
//
// Copyright 2015 Intel Corporation All Rights Reserved.
//
// The source code contained or described herein and all documents related to
// the source code (Material) are owned by Intel Corporation or its suppliers
// or licensors. Title to the Material remains with Intel Corporation or its
// suppliers and licensors. The Material may contain trade secrets and
// proprietary and confidential information of Intel Corporation and its
// suppliers and licensors, and is protected by worldwide copyright and trade
// secret laws and treaty provisions. No part of the Material may be used,
// copied, reproduced, modified, published, uploaded, posted, transmitted,
// distributed, or disclosed in any way without Intel's prior express written
// permission.
//
// No license under any patent, copyright, trade secret or other intellectual
// property right is granted to or conferred upon you by disclosure or
// delivery of the Materials, either expressly, by implication, inducement,
// estoppel or otherwise. Any license under such intellectual property rights
// must be express and approved by Intel in writing.
//////////////////////////////////////////////////////////////////////////////

package com.intel.graphbuilder.elements

/**
 * This wrapper maps a gbId to a Physical ID
 * <p>
 * This is to get around the fact that Titan won't allow you to specify physical ids.
 * It might be useful for other vendors too though.
 * </p>
 *
 * @param gbId the unique property used by Graph Builder
 * @param physicalId the ID used by the underlying graph storage
 */
case class GbIdToPhysicalId(gbId: Property, physicalId: AnyRef) {

  def toTuple: (Property, AnyRef) = {
    (gbId, physicalId)
  }
}
