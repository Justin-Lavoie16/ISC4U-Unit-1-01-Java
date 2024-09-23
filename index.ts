/**
 * Finds how much logs a truck can carry if the max weight it can carry is 1100 kg and each log is 20 kg/m
 * 
 * By:      Justin Lavoie
 * Version: 1.0
 * Since:   2024-09-19
 */ 

import { createPrompt } from 'bun-promptx'

const length = await createPrompt('Enter log length (m): ')

if (length.value !== null) {
    const logLength = parseFloat(length.value)
    const maxLogsCarried = 1100 / (20 * logLength)

    console.log(`A truck can carry ${maxLogsCarried} ${logLength} meter long logs.`)
} else {
    console.log('Invalid log length provided.')
}

console.log('\nDone.')
